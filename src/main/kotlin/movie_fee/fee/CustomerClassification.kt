package movie_fee.fee

import movie_fee.Customer
import movie_fee.MembershipCard
import movie_fee.StudentCard

/**
 * 顧客区分
 */
enum class CustomerClassification(
    override val condition: (Customer) -> Boolean
): Classification<Customer> {
    MEMBER({
        MembershipCard::class in it.belongingsList
    }),
    ADULT({
        it.age >= 20
    }),
    STUDENT({
        StudentCard::class in it.belongingsList
    }),
    HIGH_SCHOOL_STUDENT({
        StudentCard.HighSchoolStudentCard::class in it.belongingsList
    });

    companion object {
        fun filterTargetOnly(t: Customer): List<Classification<Customer>> = values().filter { it.condition(t) }
    }
}