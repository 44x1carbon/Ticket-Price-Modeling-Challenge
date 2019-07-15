package movie_fee.fee

enum class FeePlan(
    val fee:Fee,
    val targetCondition: (List<Classification>) -> Boolean
) {
    REGUAL_ADUL(Fee(1800U), {
        it.contains(CustomerClassification.ADULT)
    })
}



