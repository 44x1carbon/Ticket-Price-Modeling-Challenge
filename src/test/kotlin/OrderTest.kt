import junit.framework.Assert.assertEquals
import movie_fee.Order
import movie_fee.fee.Fee
import org.junit.Test

class OrderTest {
    @Test
    fun 会員ではない大人の男性一人の場合は1800円() {
        val order = Order(
            memberList = listOf(
                CustomerFactory.regularAdultMale()
            ),
            screening = ScreeningFactory.normalScreening()
        )

        assertEquals(Fee(1800U), order.totalFee)
    }
}