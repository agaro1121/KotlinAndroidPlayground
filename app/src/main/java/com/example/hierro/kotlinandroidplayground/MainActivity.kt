package com.example.hierro.kotlinandroidplayground

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView) as TextView

        val list = listOf(1,2,3,4,5)
        textView.text = list.map{it + 1}.toString()
    }
}
