package movie_fee

sealed class Item

object MembershipCard: Item()
object DisabilityHandbook: Item()

sealed class StudentCard: Item() {
    object HighSchoolStudentCard: StudentCard()
}


