package com.benhul.lat3_if5_10119170_elbarunawifaldzan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class BiodataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            sendMessage()
        }

    }

    private fun sendMessage () {
        val textView = findViewById<EditText>(R.id.editTextTextPersonName)
        val message = textView.text.toString()
        val intent = Intent(this,HasilActivity::class.java)
        intent.apply {
            putExtra("theMessage",message)
        }
        startActivity(intent)
    }

}