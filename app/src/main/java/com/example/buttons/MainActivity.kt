package com.example.buttons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.buttons.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
        Toast.makeText(this , binding.etResult.text.toString(),Toast.LENGTH_LONG).show()
        }
        binding.button2.setOnClickListener {
            binding.tvResult.text = binding.etResult2.text.toString()
        }
    }

    fun newActivity(view: View) {
        val intent = Intent(this, MainActivity2 :: class.java)
        intent.putExtra("result",binding.etResult3.text.toString())
        startActivity(intent)
    }


}