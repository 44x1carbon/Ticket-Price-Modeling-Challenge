package movie_fee.fee

/**
 * 料金
 */
inline class Fee(val amount: UInt) {
    operator fun plus(fee: Fee): Fee {
        return Fee(amount + fee.amount)
    }
}