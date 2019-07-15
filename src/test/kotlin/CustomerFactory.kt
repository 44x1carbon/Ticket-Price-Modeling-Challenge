import movie_fee.Customer
import movie_fee.fee.Sex

object CustomerFactory {
    fun regularAdultMale(): Customer {
        return Customer(
            sex = Sex.MALE,
            age = 20
        )
    }
}