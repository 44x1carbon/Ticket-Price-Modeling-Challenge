import movie_fee.Customer
import movie_fee.ItemList
import movie_fee.MembershipCard
import movie_fee.Sex

object CustomerFactory {
    fun regularAdultMale(): Customer {
        return Customer(
            sex = Sex.MALE,
            age = 20
        )
    }

    fun memberAdultMale(): Customer {
        return Customer(
            sex = Sex.MALE,
            age = 20,
            belongingsList = ItemList(MembershipCard)
        )
    }
}