package labs.lab3

open class MyString(protected val str : String) {
    val value : String
        get() = this.str

    val length : Int
        get() = this.str.length

    fun countSymbols(char : Char) : Int {
        var count = 0
        for (i in this.str) {
            if (i == char) count++
        }
        return count
    }
    override fun toString(): String = this.str
}