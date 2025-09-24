
import java.io.File

fun main() {
	println("=".repeat(10))
	println("Task 1:")
	println("=".repeat(10))
	try {
		task1("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt")
		task1("abcd")
	} catch (e: Exception) {
		println(e.message)
	}
	println("=".repeat(10))
	println("Task 2:")
	println("=".repeat(10))
	try {
		task2()
	} catch (e: Exception) {
		println(e.message)
	}
}

fun task1(text: String) {
	val builder = StringBuilder(text)
	var changes = 0
	for (i in 0 until builder.length) {
		if (builder[i] == 'i') {
			builder[i] = '1'
			changes++
		}
	}
	if (changes == 0) throw Exception("Text contains no i's")
	println("New text: $builder")
	println("Number of changes: $changes")
}

fun task1_2(text: String) {
	val builder = StringBuilder(text)
	var changes = 0
	var foundNumber = false
	for (i in 0 until builder.length) {
		if (builder[i] == 'i') {
			builder[i] = '1'
			changes++
		} else if (builder[i].isDigit()) {
			foundNumber = true
		}
	}
	if (!foundNumber) throw Exception("Text contains no numbers")
	println("New text: $builder")
	println("Number of changes: $changes")
}

fun task2() {
	val inputFile = File("input.txt")
	if (!inputFile.exists()) {
		throw NoSuchFileException(inputFile)
	}
	var text = inputFile.readText()
	if (text[0] != '{' || text[text.length-1] != '}') {
		throw Exception("Ivalid input text")
	}
	text = text.substring(1,text.length - 1)
	val splits = text.split(',')
	val phoneNumbers = mutableMapOf<String,Long>()
	splits.forEach {
		val trimmed = it.trim()
		val keyValue = trimmed.split('=')
		if (keyValue.size != 2) {
			throw Exception("Invalid line: $trimmed")
		}
		phoneNumbers[keyValue[0]] = keyValue[1].toLongOrNull() ?: throw Exception("Invalid phone number ${keyValue[1]}")
	}
	println("Phone numbers of people whose last name starts with a P:")
	phoneNumbers.forEach {
		if (it.key[0] == 'P') {
			println("${it.key}: ${it.value}")
		}
	}
	File("output.txt").writeText(phoneNumbers.toString())
}