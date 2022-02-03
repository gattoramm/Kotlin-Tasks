package task01.task0109

/**
 * Сумма цифр трехзначного числа
 * */

fun main() = print(sumDigitsInNumber(453))

fun sumDigitsInNumber (n: Int): Int = n % 10 + n % 100 / 10 + n / 100