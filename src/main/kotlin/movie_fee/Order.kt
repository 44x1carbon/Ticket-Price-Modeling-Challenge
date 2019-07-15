package movie_fee

import movie_fee.fee.*
import java.time.LocalDateTime

/**
 * 注文
 */
class Order(
    val memberList: List<Customer>,
    val screening: Screening,
    val orderedAt: LocalDateTime
) {
    val totalFee: Fee get() {
        return memberList
            .map { it.lowestPriceFeePlan() }
            .foldIndexed(Fee(0U)) { _, acc, feePlan -> acc + feePlan.fee }
    }

    fun Customer.feePlanList(): List<FeePlan> {
        val classifications: List<Classification<*>> = CustomerClassification.filterTargetOnly(this) + TimeClassification.filterTargetOnly(orderedAt)
        return FeePlan.planList.filter { it.targetCondition(classifications) }
    }

    fun Customer.lowestPriceFeePlan(): FeePlan {
        return feePlanList().sortedBy { it.fee.amount }.first()
    }
}