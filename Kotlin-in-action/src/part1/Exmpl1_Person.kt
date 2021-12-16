package part1

data class Person1(val name: String, val age: Int? = null)

fun main(args: Array<String>){
    val persons = listOf(Person1("Alice"), Person1("Bob", 29))

    val oldest = persons.maxByOrNull { it.age ?: 0 }
    println("The oldest is: $oldest")
}
