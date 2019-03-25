package com.example.fizzbuzzoverlay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {

    private val fizzbuzz = Fizzbuzz()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        play.setOnClickListener {
            playFizzbuzz(inputField.text.toString())
        }
    }

    private fun playFizzbuzz(input: String) {
        if(input.isEmpty()) {
            output.text = "Please input a number into the input box"
        }
        else  {
            try {
                output.text = fizzbuzz.playGame(Integer.valueOf(input.trim()))
            }
            catch (e: NumberFormatException) {
                output.text = "Please input a number into the input box"
            }
        }
    }
}
