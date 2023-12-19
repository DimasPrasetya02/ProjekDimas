package com.jayakarta.projekdimas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.jayakarta.projekdimas.databinding.ActivityHomeBinding
import com.jayakarta.projekdimas.databinding.ActivityReviewBinding

class review : AppCompatActivity() , View.OnClickListener{
    lateinit var binding: ActivityReviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        val film: Button = findViewById(R.id.Review)
        film.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null)
            when (v.id) {
                R.id.Review -> {
                    val film1 = Intent(this, ListMovies::class.java)
                    startActivity(film1)
                }
            }
    }
}
