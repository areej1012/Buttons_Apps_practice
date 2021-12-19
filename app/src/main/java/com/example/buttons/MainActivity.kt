package com.example.buttons

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
            Toast.makeText(this, "setOnClickListener",Toast.LENGTH_SHORT).show()
        }
    }

    fun displayXml(view: View) {
        Toast.makeText(this, "onClick",Toast.LENGTH_SHORT).show()
    }
}