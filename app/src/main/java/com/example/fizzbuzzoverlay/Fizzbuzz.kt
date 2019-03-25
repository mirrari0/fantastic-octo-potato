package com.example.fizzbuzzoverlay

class Fizzbuzz {

    fun playGame(input: Int) : String {
        if(input%3==0) {
            return "Fizz"
        }
        if(input%5==0){
            return "Buzz"
        }
        return input.toString()
    }
}