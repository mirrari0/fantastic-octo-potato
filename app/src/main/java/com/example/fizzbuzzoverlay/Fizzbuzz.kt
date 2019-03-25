package com.example.fizzbuzzoverlay

class Fizzbuzz {

    fun playGame(input: Int): String {
        return if (input % 15 == 0) {
            "FizzBuzz"
        } else if (input % 3 == 0) {
            "Fizz"
        } else if (input % 5 == 0) {
            "Buzz"
        } else {
            input.toString()
        }
    }
}