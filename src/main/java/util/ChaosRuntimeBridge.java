package util;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import net.minecraft.item.ItemStack;

import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.metatileentity.implementations.MTEEnhancedMultiBlockBase;
import gregtech.api.metatileentity.implementations.MTEExtendedPowerMultiBlockBase;
import gregtech.api.metatileentity.implementations.MTEMultiBlockBase;
import gregtech.api.recipe.check.CheckRecipeResult;

public final class ChaosRuntimeBridge {

    private static final Map<Class<?>, Map<String, Field>> FIELD_CACHE = new HashMap<>();

    private ChaosRuntimeBridge() {}

    public static boolean supports(MTEMultiBlockBase prototype) {
        return prototype != null;
    }

    public static boolean supportsMachineModeSwitch(MTEMultiBlockBase delegate) {
        if (delegate == null) {
            return false;
        }
        if (delegate.supportsMachineModeSwitch()) {
            return true;
        }
        try {
            return delegate.getClass()
                .getMethod("setMachineMode", int.class)
                .getDeclaringClass() != MTEMultiBlockBase.class;
        } catch (NoSuchMethodException exception) {
            return false;
        }
    }

    public static MTEMultiBlockBase create(MTEMultiBlockBase prototype, MTEMultiBlockBase source)
        throws ReflectiveOperationException {
        if (prototype == null || source == null || source.getBaseMetaTileEntity() == null) {
            return null;
        }
        if (!(prototype.newMetaEntity(source.getBaseMetaTileEntity()) instanceof MTEMultiBlockBase delegate)) {
            return null;
        }
        syncToDelegate(source, delegate);
        invokeWithBase(source, delegate, () -> {
            delegate.onFirstTick(source.getBaseMetaTileEntity());
            return null;
        });
        return delegate;
    }

    public static void syncToDelegate(MTEMultiBlockBase source, MTEMultiBlockBase delegate)
        throws IllegalAccessException {
        copyFields(source, delegate);
        ItemStack controller = source.getControllerSlot();
        delegate
            .setInventorySlotContents(delegate.getControllerSlotIndex(), controller == null ? null : controller.copy());
        setField(delegate, "mMachine", source.mMachine);
        setField(delegate, "EUtCanUse", source.getMaxInputEu());
        setAliasField(delegate, "isWirelessMode", getField(source, "wirelessMode"));
        if (Boolean.TRUE.equals(getField(source, "wirelessMode"))) {
            setField(delegate, "lEUt", 0L);
            setField(delegate, "mEUt", 0);
        }
        String delegateClass = delegate.getClass()
            .getName();
        if ("com.MessTech.common.machine.MTChemicalTwister".equals(delegateClass)) {
            setField(delegate, "mStructureLevel", 2);
            setField(delegate, "mHeatingCapacity", 12601);
        }
    }

    public static void syncFromDelegate(MTEMultiBlockBase delegate, MTEMultiBlockBase source)
        throws IllegalAccessException {
        copyFields(delegate, source);
    }

    public static void setMachineMode(MTEMultiBlockBase source, MTEMultiBlockBase delegate, int index)
        throws ReflectiveOperationException {
        invokeWithBase(source, delegate, () -> {
            delegate.setMachineMode(index);
            return null;
        });
    }

    public static int switchMachineMode(MTEMultiBlockBase source, MTEMultiBlockBase delegate)
        throws ReflectiveOperationException {
        syncToDelegate(source, delegate);
        return invokeWithBase(source, delegate, () -> {
            delegate.onMachineModeSwitchClick();
            int currentMode = delegate.getMachineMode();
            int nextMode;
            if (overrides(delegate, "nextMachineMode")) {
                nextMode = delegate.nextMachineMode();
            } else {
                Integer modeCount = findEnumModeCount(delegate, currentMode);
                if (modeCount != null) {
                    nextMode = Math.floorMod(currentMode + 1, modeCount);
                } else {
                    Integer iconCount = findModeIconCount(delegate);
                    nextMode = iconCount == null ? delegate.nextMachineMode()
                        : Math.floorMod(currentMode + 1, iconCount);
                }
            }
            delegate.setMachineMode(nextMode);
            return delegate.getMachineMode();
        });
    }

    private static boolean overrides(MTEMultiBlockBase delegate, String method) throws NoSuchMethodException {
        return delegate.getClass()
            .getMethod(method)
            .getDeclaringClass() != MTEMultiBlockBase.class;
    }

    private static Integer findEnumModeCount(MTEMultiBlockBase delegate, int mode) throws IllegalAccessException {
        for (Field field : fieldsFor(delegate.getClass()).values()) {
            if (Modifier.isStatic(field.getModifiers()) || !field.getType()
                .isEnum()
                || !field.getName()
                    .toLowerCase(Locale.ROOT)
                    .contains("mode")) {
                continue;
            }
            if (field.get(delegate) instanceof Enum<?>current && current.ordinal() == mode) {
                return field.getType()
                    .getEnumConstants().length;
            }
        }
        return null;
    }

    private static Integer findModeIconCount(MTEMultiBlockBase delegate) throws IllegalAccessException {
        for (Field field : fieldsFor(delegate.getClass()).values()) {
            if (!field.getName()
                .replace("_", "")
                .toLowerCase(Locale.ROOT)
                .endsWith("modeicons")) {
                continue;
            }
            Object icons = field.get(delegate);
            int count = icons instanceof List<?>list ? list.size()
                : icons != null && icons.getClass()
                    .isArray() ? Array.getLength(icons) : 0;
            if (count > 0) return count;
        }
        return null;
    }

    public static CheckRecipeResult checkProcessing(MTEMultiBlockBase source, MTEMultiBlockBase delegate)
        throws ReflectiveOperationException {
        return checkProcessing(source, delegate, 1);
    }

    public static CheckRecipeResult checkProcessing(MTEMultiBlockBase source, MTEMultiBlockBase delegate,
        int machineCount) throws ReflectiveOperationException {
        syncToDelegate(source, delegate);
        CheckRecipeResult result = invokeWithBase(source, delegate, delegate::checkProcessing);
        if (result.wasSuccessful()) {
            setProcessingTime(delegate, machineCount);
        }
        syncFromDelegate(delegate, source);
        return result;
    }

    private static void setProcessingTime(MTEMultiBlockBase delegate, int machineCount) {
        int processingTime = delegate.mMaxProgresstime;
        if (processingTime <= 1 || machineCount <= 1) {
            delegate.mMaxProgresstime = Math.max(1, processingTime);
            return;
        }
        delegate.mMaxProgresstime = (int) Math.max(1L, ((long) processingTime + machineCount - 1L) / machineCount);
    }

    public static boolean isCustomCheckProcessing(MTEMultiBlockBase delegate) {
        try {
            Class<?> declaringClass = delegate.getClass()
                .getMethod("checkProcessing")
                .getDeclaringClass();
            return declaringClass != MTEMultiBlockBase.class;
        } catch (NoSuchMethodException exception) {
            return false;
        }
    }

    public static boolean isCustomRunningTick(MTEMultiBlockBase delegate) {
        try {
            Class<?> declaringClass = delegate.getClass()
                .getMethod("onRunningTick", ItemStack.class)
                .getDeclaringClass();
            return declaringClass != MTEMultiBlockBase.class && declaringClass != MTEEnhancedMultiBlockBase.class
                && declaringClass != MTEExtendedPowerMultiBlockBase.class;
        } catch (NoSuchMethodException exception) {
            return false;
        }
    }

    public static boolean invokeCustomRunningTick(MTEMultiBlockBase source, MTEMultiBlockBase delegate,
        ItemStack controller) throws ReflectiveOperationException {
        if (!isCustomRunningTick(delegate)) {
            return true;
        }
        Field euTick = findField(delegate.getClass(), "lEUt");
        Field mEuTick = findField(delegate.getClass(), "mEUt");
        Object oldEuTick = euTick == null ? null : getFieldValue(euTick, delegate);
        Object oldMEuTick = mEuTick == null ? null : getFieldValue(mEuTick, delegate);
        boolean completed = false;
        boolean result = false;
        try {
            if (euTick != null) euTick.set(delegate, 0L);
            if (mEuTick != null) mEuTick.set(delegate, 0);
            result = invokeWithBase(source, delegate, () -> delegate.onRunningTick(controller));
            completed = true;
            return result;
        } finally {
            if (!completed || result) {
                if (euTick != null) euTick.set(delegate, oldEuTick);
                if (mEuTick != null) mEuTick.set(delegate, oldMEuTick);
            }
        }
    }

    private static <T> T invokeWithBase(MTEMultiBlockBase source, MTEMultiBlockBase delegate,
        ThrowingSupplier<T> action) throws ReflectiveOperationException {
        IGregTechTileEntity base = source.getBaseMetaTileEntity();
        delegate.setBaseMetaTileEntity(base);
        try {
            return action.get();
        } finally {
            delegate.setBaseMetaTileEntity(null);
            source.setBaseMetaTileEntity(base);
        }
    }

    private static void copyFields(Object source, Object target) throws IllegalAccessException {
        Map<String, Field> sourceFields = fieldsFor(source.getClass());
        Map<String, Field> targetFields = fieldsFor(target.getClass());
        for (Map.Entry<String, Field> entry : sourceFields.entrySet()) {
            String name = entry.getKey();
            if (name.equals("mInventory") || name.equals("mBaseMetaTileEntity")
                || name.equals("processingLogic")
                || name.equals("inventoryHandler")
                || name.equals("mode")
                || name.equals("machineMode")
                || name.equals("machineModeIcons")) {
                continue;
            }
            Field sourceField = entry.getValue();
            Field targetField = targetFields.get(name);
            if (targetField == null || Modifier.isFinal(targetField.getModifiers())
                || Modifier.isStatic(targetField.getModifiers())
                || !targetField.getType()
                    .isAssignableFrom(sourceField.getType())) {
                continue;
            }
            Object value = getFieldValue(sourceField, source);
            targetField.set(target, value);
        }
    }

    private static Map<String, Field> fieldsFor(Class<?> type) {
        synchronized (FIELD_CACHE) {
            return FIELD_CACHE.computeIfAbsent(type, ChaosRuntimeBridge::scanFields);
        }
    }

    private static Map<String, Field> scanFields(Class<?> type) {
        Map<String, Field> fields = new HashMap<>();
        for (Class<?> current = type; current != null; current = current.getSuperclass()) {
            for (Field field : current.getDeclaredFields()) {
                fields.putIfAbsent(field.getName(), accessible(field));
            }
        }
        return fields;
    }

    private static Field findField(Class<?> type, String name) {
        return fieldsFor(type).get(name);
    }

    private static Field accessible(Field field) {
        field.setAccessible(true);
        return field;
    }

    private static Object getField(Object source, String name) {
        Field field = findField(source.getClass(), name);
        return field == null ? null : getFieldValue(field, source);
    }

    private static Object getFieldValue(Field field, Object source) {
        try {
            return field.get(source);
        } catch (IllegalAccessException exception) {
            return null;
        }
    }

    private static void setField(Object target, String name, Object value) {
        Field field = findField(target.getClass(), name);
        if (field == null || Modifier.isFinal(field.getModifiers()) || Modifier.isStatic(field.getModifiers())) {
            return;
        }
        try {
            field.set(target, value);
        } catch (IllegalAccessException ignored) {}
    }

    private static void setAliasField(Object target, String name, Object value) {
        if (value == null) return;
        setField(target, name, value);
    }

    @FunctionalInterface
    private interface ThrowingSupplier<T> {

        T get() throws ReflectiveOperationException;
    }
}
