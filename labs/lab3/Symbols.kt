package labs.lab3

const val ALLOWED_SYMBOLS = "!@#$%^&*()-_=+[]{}<>?/,.|';:\"\\"

class Symbols(str : String) : MyString(str) {
    init {
        for (i in this.str) {
            if (!ALLOWED_SYMBOLS.contains(i)) throw IllegalArgumentException("Only $ALLOWED_SYMBOLS allowed")
        }
    }

    fun countAsterisks() : Int = this.countSymbols('*')
}