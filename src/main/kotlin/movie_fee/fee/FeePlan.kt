package movie_fee.fee

/**
 * 料金プラン
 */
class FeePlan(
    val fee:Fee,
    val targetCondition: (List<Classification<*>>) -> Boolean
) {
    companion object {
        val planList: List<FeePlan> = listOf(
            FeePlan(Fee(1800U)) {
                it.contains(CustomerClassification.ADULT)
            }
        )
    }
}



