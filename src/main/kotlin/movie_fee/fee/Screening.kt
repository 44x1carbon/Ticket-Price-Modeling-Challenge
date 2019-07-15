package movie_fee.fee

import java.time.LocalTime

/**
 * 上映
 */
data class Screening(
    val startTime: LocalTime,
    val endTime: LocalTime
) {
}