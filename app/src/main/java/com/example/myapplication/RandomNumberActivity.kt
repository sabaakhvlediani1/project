package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_random_number_layout.*

class RandomNumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_number_layout)
        init()
    }

    private fun init(){
        generate.setOnClickListener {
            d("Button","Button is active")
            generateRandomNumber()
        }

    }
     private fun generateRandomNumber(){
         val number:Int = (-100..100).random()
         d("randomNumber","$number")
         if (number % 5==0) {
             if(number / 5 > 0)
              random.text = "Yes"
         }else{
              random.text="No"
         }
    }
}