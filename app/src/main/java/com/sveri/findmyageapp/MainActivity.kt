package com.sveri.findmyageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.Calendar
import java.util.Date


class MainActivity : AppCompatActivity() {

    //private val dob: EditText = TODO()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dob: EditText = findViewById(R.id.editTextBirthDate)
        val tvResult: TextView = findViewById(R.id.textViewResult)
        val btnFindAge: Button = findViewById(R.id.buttonSubmit)

        btnFindAge.setOnClickListener {
            val userDOB = Integer.parseInt(dob.text.toString())
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)

            val age = currentYear - userDOB

            if (userDOB > currentYear){

                tvResult.text = "You are yet to take birth"
            }else {
                tvResult.text = "Your age is ${age.toString()} years!"
            }

        }
    }
}