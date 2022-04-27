package com.benhul.lat3_if5_10119170_elbarunawifaldzan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnmulai : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnmulai = findViewById(R.id.button)

        btnmulai.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button->{
                val intenBiasa = Intent(this@MainActivity, KodeKeluargaActivity::class.java)
                startActivity(intenBiasa)
            }
        }
    }
}