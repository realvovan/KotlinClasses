package labs.lab3

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class StringTests {
    @Test
    fun testLength() {
        val s = MyString("Hello")
        assertEquals(5,s.length)
    }
    @Test
    fun testToString() {
        val s = MyString("Hello world")
        assertEquals("Hello world", s.toString())
    }
    @Test
    fun testCount() {
        val s = MyString("Hello")
        assertEquals(2,s.countSymbols('l'))
    }
    @Test
    fun testCountAsterisks() {
        val s = Symbols("!@#*@")
        assertEquals(1, s.countAsterisks())
    }
    @Test
    fun testCountLetterB() {
        val s = CapitalLetters("BBBQBG")
        assertEquals(4, s.countLetterB())
    }
}