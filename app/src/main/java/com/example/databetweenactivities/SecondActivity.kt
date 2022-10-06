package com.example.databetweenactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = intent.getStringExtra("EXTRA_NAME")
        val age = intent.getIntExtra("EXTRA_AGE",0)
        val country = intent.getStringExtra("EXTRA_COUNTRY")


        val personString = "$name is $age years old and lives in $country"


        //Uncomment next line and line 24  and comment out line 12 to 18 to pass an object
        //val person = intent.getSerializableExtra("EXTRA_PERSON") as Person

        val personEt = findViewById<TextView>(R.id.tvPerson)
        personEt.text = personString//.toString()
    }
}