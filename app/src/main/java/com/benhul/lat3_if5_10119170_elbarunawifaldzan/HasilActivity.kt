package com.benhul.lat3_if5_10119170_elbarunawifaldzan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class HasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val message = intent.getStringExtra("theMessage")

        val textView = findViewById<TextView>(R.id.textView)
        textView.apply {
            text = message
        }
    }
}