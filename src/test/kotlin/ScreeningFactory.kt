import movie_fee.fee.Screening
import java.time.LocalTime

object ScreeningFactory {
    fun normalScreening(): Screening {
        return Screening(
            startTime = LocalTime.of(11, 10),
            endTime = LocalTime.of(12, 45)
        )
    }
}