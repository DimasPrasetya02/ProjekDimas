package com.jayakarta.projekdimas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.jayakarta.projekdimas.databinding.ActivityProjek2Binding


class Projek2 : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityProjek2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProjek2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonOne.setOnClickListener {
            rollDice()
        }
        val next: Button = findViewById(R.id.next)
        next.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null)
            when (v.id) {
                R.id.next -> {
                    val halamanberikutnya = Intent(this, MainActivity::class.java)
                    startActivity(halamanberikutnya)
                }
            }
    }

    private fun rollDice()
    {
        val dice = Dice(7)
        val sides = dice.diceRoll()
        val dR = when(sides)
        {
            1-> R.drawable.gambar_2
            2-> R.drawable.gambar_3
            3-> R.drawable.gambar_4
            4-> R.drawable.gambar_5
            5-> R.drawable.gambar_6
            6-> R.drawable.gambar_7
            else -> R.drawable.gambar_1
        }
        binding.imageView.setImageResource(dR)
    }
}
class Dice(private val numSides: Int)
{
    fun diceRoll() : Int
    {
        return(1..numSides).random()

    }
}
