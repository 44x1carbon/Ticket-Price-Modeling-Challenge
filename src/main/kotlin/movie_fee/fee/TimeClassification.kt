package movie_fee.fee

import movie_fee.Customer
import java.time.DayOfWeek
import java.time.LocalDateTime

enum class TimeClassification(
    override val condition: (LocalDateTime) -> Boolean
): Classification<LocalDateTime> {
    WEEKDAY({
        listOf(DayOfWeek.SUNDAY, DayOfWeek.SATURDAY).contains(it.dayOfWeek).not()
    }),
    HOLIDAY({
        listOf(DayOfWeek.SUNDAY, DayOfWeek.SATURDAY).contains(it.dayOfWeek)
    });

    companion object {
        fun filterTargetOnly(t: LocalDateTime): List<Classification<LocalDateTime>> = values().filter { it.condition(t) }
    }
}