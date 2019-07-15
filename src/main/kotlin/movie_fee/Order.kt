package movie_fee

import movie_fee.fee.*

/**
 * 注文
 */
class Order(val memberList: List<Customer>, val screening: Screening) {
    val totalFee: Fee get() {
        return memberList
            .map { it.lowestPriceFeePlan(screening) }
            .foldIndexed(Fee(0U)) { _, acc, feePlan -> acc + feePlan.fee }
    }

    fun Customer.feePlanList(screening: Screening): List<FeePlan> {
        val classifications: List<Classification> = CustomerClassification.values().filter { it.condition(this) }
        return FeePlan.values().filter { it.targetCondition(classifications) }
    }

    fun Customer.lowestPriceFeePlan(screening: Screening): FeePlan {
        return feePlanList(screening).sortedBy { it.fee.amount }.first()
    }
}