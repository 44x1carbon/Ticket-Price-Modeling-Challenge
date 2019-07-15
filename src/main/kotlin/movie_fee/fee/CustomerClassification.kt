package movie_fee.fee

import movie_fee.Customer
import movie_fee.MembershipCard
import movie_fee.StudentCard

enum class CustomerClassification(
    val condition: (Customer) -> Boolean
): Classification {
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
    })
}