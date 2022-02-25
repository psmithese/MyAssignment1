package com.example.myassignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        }

    override fun onResume() {
        super.onResume()
        val textView = findViewById<TextView>(R.id.textDetails)
        val data = intent.getStringExtra("EXTRA_MESSAGE")
        data?.let {
            textView.text = data
        }
    }

    }
