The unexpected behavior arises from the fact that `map.entries.removeIf` modifies the `entries` set view, but the underlying map is not directly altered. To solve this, iterate over the keys and remove elements based on their values:

```kotlin
fun main() {
    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val keysToRemove = mutableListOf<String>()
    for (entry in map.entries) {
        if (entry.value % 2 == 0) {
            keysToRemove.add(entry.key)
        }
    }
    keysToRemove.forEach { map.remove(it) }
    println(map) // Output: {a=1, c=3}
}
```
Alternatively, create a new map containing only the elements that satisfy the condition:

```kotlin
fun main() {
    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val newMap = map.filterValues { it % 2 != 0 }
    println(newMap) // Output: {a=1, c=3}
}
```
This approach avoids the complexities of modifying a collection while iterating and provides a cleaner solution.