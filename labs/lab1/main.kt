
import kotlin.math.exp// 1. Написати програму порівняння двох чисел.
// 2. Написати програму, яка виконує цілочисельне ділення натуральних чисел через операцію
// віднімання, не використовуючи операцію ділення.
// 3. Написати програму, яка виконує множення натуральних чисел через операцію додавання,
// не використовуючи операцію множення.
// 4. Написати програму, яка в циклі обчислює суму ряду
// (формула в лабораторній)
// із виведенням результату суми (не n-го члена) для кожної ітерації.

fun main() {
	var isRunning = true
	while (isRunning) {
		print("Please select the lab task (1-4) or 5 to exit: ")
		val action = readln()
		if (action == "1") {
			print("Enter the first number: ")
			val num1 = readln().toDoubleOrNull() 
			print("Enter the second number: ")
			val num2 = readln().toDoubleOrNull()
			if (num1 == null || num2 == null) {
				println("Invalid input!")
				continue
			}
			println("Numbers are ${if (num1 == num2) "equal" else "not equal"}")
		} else if (action == "2") {
			print("Please enter a natural number: ")
			val num1 = readln().toIntOrNull()
			print("Please enter another natural number: ")
			val num2 = readln().toIntOrNull()
			if (num1 == null || num2 == null || num1 < 1 || num2 < 1) {
				println("Invalid input!")
				continue
			}
			var dividend = num1
			var result = 0
			while (dividend >= num2) {
				dividend -= num2
				result++
			}
			println("${num1} // ${num2} = ${result}")
		} else if (action == "3") {
			print("Please enter a natural number: ")
			val num1 = readln().toIntOrNull()
			print("Please enter another natural number: ")
			val num2 = readln().toIntOrNull()
			if (num1 == null || num2 == null || num1 < 1 || num2 < 1) {
				println("Invalid input!")
				continue
			}
			var mul = 0
			for (i in 1..num2) {
				mul += num1
			}
			println("${num1} * ${num2} = ${mul}")
		} else if (action == "4") {
			print("Enter the number of iterations: ")
			val n = readln().toIntOrNull()
			if (n == null || n < 1) {
				println("Invalid input")
				continue
			}
			fun pow(base: Int, exponent: Int) : Int {
				var result = 1
				for (i in 1..exponent) result *= base
				return result
			}
			fun factorial(x: Int) : Int {
				if (x == 0 || x == 1) return 1
				return x * factorial(x - 1)
			}
			var sum = 0.0
			for (i in 1..n) {
				val iterationResult = (pow(3,i) * factorial(i))/pow(i,i).toDouble()
				println("Result on iteration ${i} is ${iterationResult}")
				sum += iterationResult
			}
			println("Final result is ${sum}")
		} else if (action == "5") isRunning = false
		else println("Invalid input!")
	}
}