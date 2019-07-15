package movie_fee

import movie_fee.fee.Sex

/**
 * 顧客
 */
data class Customer(
    val sex: Sex,
    val age: Int,
    val belongingsList: ItemList = ItemList()
) {}