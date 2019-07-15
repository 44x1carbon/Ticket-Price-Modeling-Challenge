package movie_fee

import kotlin.reflect.KClass

/**
 * 持ち物リスト
 */
class ItemList(vararg items: Item) {
    val items: List<Item> = items.toList()
    operator fun <T: Item> contains(klass: KClass<T>): Boolean = items.filterIsInstance(klass.java).isNotEmpty()
}