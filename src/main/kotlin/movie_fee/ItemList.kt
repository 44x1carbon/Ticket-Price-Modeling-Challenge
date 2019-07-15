package movie_fee

import kotlin.reflect.KClass

/**
 * 持ち物リスト
 */
class ItemList(private val items: List<Item> = listOf()) {
    operator fun <T: Item> contains(klass: KClass<T>): Boolean = items.filterIsInstance(klass.java).isNotEmpty()
}