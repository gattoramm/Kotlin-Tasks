package part1

class Person3(val name: String, var isMarried: Boolean)

fun main(args: Array<String>) {
    val person = Person3("Bob", true)
    println(person.name)
    println(person.isMarried)
    person.isMarried = false
    println(person.isMarried)
}