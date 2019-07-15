package movie_fee

/**
 * 顧客
 */
data class Customer(
    val sex: Sex,
    val age: Int,
    val belongingsList: ItemList = ItemList()
) {}