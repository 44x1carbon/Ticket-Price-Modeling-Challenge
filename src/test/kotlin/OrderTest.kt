import junit.framework.Assert.assertEquals
import movie_fee.Order
import movie_fee.fee.Fee
import org.junit.Test
import java.time.LocalDateTime
import java.time.Month

class OrderTest {
    @Test
    fun 会員ではない大人の男性一人の場合は1800円() {
        val order = Order(
            memberList = listOf(
                CustomerFactory.regularAdultMale()
            ),
            screening = ScreeningFactory.normalScreening(),
            orderedAt = LocalDateTime.of(2019, Month.JULY, 16, 12, 0)
        )

        assertEquals(Fee(1800U), order.totalFee)
    }
}