package com.example.myassignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    private lateinit var startBtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.startBtn = findViewById(R.id.startBtn)
        startBtn.setOnClickListener() {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)

        val txtname = findViewById<EditText>(R.id.editText)
        val name = txtname.text.toString()
        intent.putExtra("EXTRA_MESSAGE", name)

            startActivity(intent)

        }

        }


    }
