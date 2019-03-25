package com.example.fizzbuzzoverlay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val fizzbuzz = Fizzbuzz()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        play.setOnClickListener {
            playFizzbuzz(inputField.text.toString())
        }
    }

    fun playFizzbuzz(input: String) {
        fizzbuzz.playGame(Integer.valueOf(input))
    }
}
