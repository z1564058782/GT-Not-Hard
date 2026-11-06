package EnumList.EnumItemList.EnumModList;

import static gregtech.api.enums.Mods.Gadomancy;
import static gregtech.api.util.GTModHandler.getModItem;

import net.minecraft.item.ItemStack;

public class GadomancyList {

    public static final ItemStack Arcane_Dropper = getModItem(Gadomancy.ID, "BlockArcaneDropper", 1L);
    public static final ItemStack Infusion_Claw = getModItem(Gadomancy.ID, "BlockInfusionClaw", 1L);
    public static final ItemStack Mirrored_Jar = getModItem(Gadomancy.ID, "BlockRemoteJar", 1L);
    public static final ItemStack Node_Manipulator = getModItem(Gadomancy.ID, "BlockNodeManipulator", 1L, 5);
    public static final ItemStack Randomization_Focus = getModItem(Gadomancy.ID, "BlockStoneMachine", 1L);
    public static final ItemStack Ancient_Pedestal = getModItem(Gadomancy.ID, "BlockStoneMachine", 1L, 1);
    public static final ItemStack Arcane_Enervation_Emitter = getModItem(Gadomancy.ID, "BlockStoneMachine", 1L, 2);
    public static final ItemStack Redirection_Focus = getModItem(Gadomancy.ID, "BlockStoneMachine", 1L, 3);
    public static final ItemStack Arcane_Packager = getModItem(Gadomancy.ID, "BlockStoneMachine", 1L, 4);
    public static final ItemStack Eldritch_Portal = getModItem(Gadomancy.ID, "BlockAdditionalEldritchPortal", 1L);
    public static final ItemStack Aura_Pylon = getModItem(Gadomancy.ID, "BlockAuraPylon", 1L);
    public static final ItemStack Aura_Pylon_Peak = getModItem(Gadomancy.ID, "BlockAuraPylon", 1L, 1);
    public static final ItemStack Book_of_Knowledge = getModItem(Gadomancy.ID, "BlockKnowledgeBook", 1L);
    public static final ItemStack Essentia_Condenser = getModItem(Gadomancy.ID, "BlockEssentiaCompressor", 1L);
    public static final ItemStack Golem_Animation_Core = getModItem(Gadomancy.ID, "ItemGolemCoreBreak", 1L);
    public static final ItemStack Element_of_Darkness = getModItem(Gadomancy.ID, "ItemElement", 1L);
    public static final ItemStack Silverwood_Golem = getModItem(Gadomancy.ID, "itemSilverwoodGolemPlacer", 1L, 8);
    public static final ItemStack Aura_Core_Blank = getModItem(Gadomancy.ID, "ItemAuraCore", 1L, 0);
    public static final ItemStack Aura_Core_Aer = getModItem(Gadomancy.ID, "ItemAuraCore", 1L, 1);
    public static final ItemStack Aura_Core_Ignis = getModItem(Gadomancy.ID, "ItemAuraCore", 1L, 2);
    public static final ItemStack Aura_Core_Aqua = getModItem(Gadomancy.ID, "ItemAuraCore", 1L, 3);
    public static final ItemStack Aura_Core_Terra = getModItem(Gadomancy.ID, "ItemAuraCore", 1L, 4);
    public static final ItemStack Aura_Core_Ordo = getModItem(Gadomancy.ID, "ItemAuraCore", 1L, 5);
    public static final ItemStack Aura_Core_Perditio = getModItem(Gadomancy.ID, "ItemAuraCore", 1L, 6);

    public static final ItemStack[] Gadomancy_List = new ItemStack[] { Arcane_Dropper, Infusion_Claw, Mirrored_Jar,
        Node_Manipulator, Randomization_Focus, Ancient_Pedestal, Arcane_Enervation_Emitter, Redirection_Focus,
        Arcane_Packager, Eldritch_Portal, Aura_Pylon, Aura_Pylon_Peak, Book_of_Knowledge, Essentia_Condenser,
        Golem_Animation_Core, Element_of_Darkness, Silverwood_Golem, Aura_Core_Blank, Aura_Core_Aer, Aura_Core_Ignis,
        Aura_Core_Aqua, Aura_Core_Terra, Aura_Core_Ordo, Aura_Core_Perditio };
}
