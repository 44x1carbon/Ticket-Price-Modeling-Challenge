package movie_fee

/**
 * 持ち物
 */
sealed class Item

/**
 * 会員証
 */
object MembershipCard: Item()

/**
 * 障がい者手帳
 */
object DisabilityHandbook: Item()

/**
 * 学生書
 */
sealed class StudentCard: Item() {
    /**
     * 学生書(高校)
     */
    object HighSchoolStudentCard: StudentCard()
}


