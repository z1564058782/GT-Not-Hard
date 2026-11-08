package hatch;

import appeng.api.networking.energy.IEnergyGrid;
import appeng.api.networking.security.BaseActionSource;
import appeng.api.storage.IMEMonitor;
import appeng.api.storage.data.IAEStack;
import appeng.util.Platform;

/**
 * 在 AE 原生带能源提取函数外处理 long 极限边界。
 * AE rv3-beta-1049 的 ceilDiv 使用 addExact(amount,unit)，直接传 Long.MAX_VALUE 会溢出；
 * 其能源换算又经过 double，因此大请求需先按可精确表示的能源单位对齐。
 * 本类不绕过权限/耗能，不按 int 分片循环；物品和流体每种资源最多两次原生提取。
 */
public final class SuperInputNetworkExtraction {

    /** 小于此数量时，能源单位向上取整及乘回数量都能保持精确整数。 */
    private static final long exactRequestLimit = 1L << 52;

    /** 纯静态工具类。 */
    private SuperInputNetworkExtraction() {}

    /**
     * 提取完整 long 请求，任一原生返回不足即失败，调用方沿用 GT 原版停机语义。
     * 
     * @param energy    原版 AE 能源网格
     * @param inventory 原版资源监视器
     * @param request   含资源身份、NBT 及完整 long 数量的请求
     * @param source    原版机器安全主体
     * @return 所有分段均按请求数量准确提取才为 true
     */
    public static <T extends IAEStack<T>> boolean extract(IEnergyGrid energy, IMEMonitor<T> inventory, T request,
        BaseActionSource source) {
        // 剩余量不求和，每轮严格递减，避免接近 long 上限时累加溢出。
        long remainingAmount = request.getStackSize();
        // 非正数量不产生真实能源或库存操作。
        if (remainingAmount <= 0) return remainingAmount == 0;
        // 原版物品单位为 1，流体单位为 1000 mB，不能把流体按物品计费。
        int amountPerUnit = request.getAmountPerUnit();
        // 非法第三方栈单位不能用于除法或循环。
        if (amountPerUnit <= 0) throw new IllegalArgumentException("Invalid AE amount per unit");
        // 通常一次；极大数量的首段对齐后余数很小，所以最多再执行一次。
        while (remainingAmount > 0) {
            // 常规请求直接交给原版，保留其单次调用和计费方式。
            long requestAmount = remainingAmount;
            // 只在 double 精度或 ceilDiv 溢出可能出现时执行对齐。
            if (requestAmount > exactRequestLimit) {
                // 给 AE addExact(amount,unit) 留足空间，不改变完整待提取差额。
                long safeAmount = Math.min(requestAmount, Long.MAX_VALUE - amountPerUnit);
                // 第一段取完整能源单位，尾段承担唯一向上取整，因此总计费不增加。
                long wholeUnits = safeAmount / amountPerUnit;
                // 计算乘回原版单位所需的有效二进制位。
                int unitBits = 32 - Integer.numberOfLeadingZeros(amountPerUnit);
                // 只保留确保乘回单位后不超过 double 53 位有效精度的整数高位。
                int shiftBits = Math.max(0, 64 - Long.numberOfLeadingZeros(wholeUnits) + unitBits - 53);
                // 使用位移向下对齐，禁止通过 double 计算或向上舍入请求数量。
                wholeUnits = (wholeUnits >> shiftBits) << shiftBits;
                // 乘积不超过 safeAmount，也严格大于 0。
                requestAmount = wholeUnits * amountPerUnit;
            }
            // 每段复制资源身份和 NBT，不修改调用方保存的原始完整请求。
            T partialRequest = request.copy();
            // 每段仍可远大于 Integer.MAX_VALUE，不枚举仓室理论分片。
            partialRequest.setStackSize(requestAmount);
            // 安全、模拟能源、真实扣料及能源计费全部保留 AE 原生实现。
            T extracted = Platform.poweredExtraction(energy, inventory, partialRequest, source);
            // 短提取不得被视为成功，否则控制器可能产生免费输出。
            if (extracted == null || extracted.getStackSize() != requestAmount) return false;
            // 直接减量保留完整 long 精度。
            remainingAmount -= requestAmount;
        }
        // 每段均通过真实数量比较后才报告成功。
        return true;
    }
}
