package com.benhul.lat3_if5_10119170_elbarunawifaldzan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class KodeKeluargaActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnkode : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kode_keluarga)

        btnkode = findViewById(R.id.button2)

        btnkode.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button2->{
                val intenBiasa = Intent(this@KodeKeluargaActivity, BiodataActivity::class.java)
                startActivity(intenBiasa)
            }
        }
    }
}