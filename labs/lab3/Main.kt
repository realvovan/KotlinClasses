package labs.lab3

fun main() {
    val myString1 = MyString("Hello World")
    val mySymbols = Symbols("!@#$***$!*")
    val uppercase = CapitalLetters("these characters will all be uppercase")
    println("${myString1}, length: ${myString1.length}, number of letters L: ${myString1.countSymbols('l')}")
    println("${mySymbols}, number of *'s: ${mySymbols.countAsterisks()}")
    println("${uppercase}, number of B's: ${uppercase.countLetterB()}")
}