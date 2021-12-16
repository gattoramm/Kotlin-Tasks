package part1

fun main(args: Array<String>) {
    println("Hello, ${if (args.size > 0) args[0] else "Kotlin"}!")
}