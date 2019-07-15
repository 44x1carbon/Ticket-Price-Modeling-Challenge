package movie_fee.fee

/**
 * 区分？
 */
interface Classification<T> {
    val condition: (T) -> Boolean
}