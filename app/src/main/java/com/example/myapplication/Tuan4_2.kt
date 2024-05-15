package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tuan4_2 : AppCompatActivity() {
    var context: Context = this
    @SuppressLint("MissInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_tuan42)
        var btnGet= findViewById<Button>(R.id.buttonGetData)
        var tvResult = findViewById<TextView>(R.id.textViewResult)

        val fn1 = VolleyFunction1()
        btnGet!!.setOnClickListener {
            fn1.getAllData(context,tvResult!!)
        }

    }
}