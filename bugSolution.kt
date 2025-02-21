```kotlin
fun main() {
    val list = listOf(1, 2, null, 4, 5)
    val result = list.mapNotNull { it?.times(2) }
    println(result)
}
```