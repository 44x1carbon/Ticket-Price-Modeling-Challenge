package movie_fee.fee

import movie_fee.Customer

/**
 * 映画料金
 */
class MovieFee(val screening: Screening, val customer: Customer) {
    val fee: Fee
        get() {
        return Fee(1000U)
    }
}