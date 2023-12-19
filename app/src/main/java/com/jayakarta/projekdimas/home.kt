package com.jayakarta.projekdimas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.jayakarta.projekdimas.databinding.ActivityHomeBinding

class home : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val lanjut: Button = findViewById(R.id.lanjut)
        lanjut.setOnClickListener(this)
        val lanjut2: Button = findViewById(R.id.lanjut2)
        lanjut2.setOnClickListener(this)

        val lanjut3: Button = findViewById(R.id.lanjut3)
        lanjut3.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null)
            when (v.id) {
                R.id.lanjut -> {
                    val lanjutprojek1 = Intent(this, review::class.java)
                    startActivity(lanjutprojek1)
                }
                R.id.lanjut2 -> {
                    val lanjutProjek2 = Intent(this, Projek2::class.java)
                    startActivity(lanjutProjek2)
                }
                R.id.lanjut3 -> {
                    val MainActivity = Intent(this, MainActivity::class.java)
                    startActivity(MainActivity)
                }
            }
    }
}
