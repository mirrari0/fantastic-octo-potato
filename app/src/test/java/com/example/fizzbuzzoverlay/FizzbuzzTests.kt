package com.example.fizzbuzzoverlay

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class FizzbuzzTests {
    @Test
    fun `when given a number that isn't a multiple of three or five, returns the number`() {
        val num = getMultipleOf(three = true, five = true, multiplier = 1)
        assertEquals(num.toString(), Fizzbuzz().playGame(num))
    }

    @Test
    fun `when given a multiple of three and not five, returns fizz`() {
        assertEquals("Fizz", Fizzbuzz().playGame(getMultipleOf(three = true, five = false, multiplier = 3)))
    }

    @Test
    fun `when given a multiple of five and not three, returns buzz`() {
        assertEquals("Buzz", Fizzbuzz().playGame(getMultipleOf(three = false, five = true, multiplier = 5)))
    }

    @Test
    fun `when given a multiple of five and three, returns fizzbuzz`() {
        assertEquals("FizzBuzz", Fizzbuzz().playGame(getMultipleOf(three = false, five = false, multiplier = 15)))
    }

    private fun getMultipleOf(three: Boolean, five: Boolean, multiplier: Int): Int {
        var number: Int = (Math.random() * 100).toInt()
        while (true) {
            val starting = number;
            if (three && !five && number % 5 == 0) {
                number++
            }
            if(five && !three && number % 3 == 0) {
                number++
            }
            if (starting == number) break
        }

        return number * multiplier
    }
}
