package labs.lab3

class CapitalLetters(str : String) : MyString(str.uppercase()) {
    fun countLetterB() : Int = this.countSymbols('B')
}