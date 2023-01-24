package com.example.ejercicio8pantallarazas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio8pantallarazas.databinding.ActivityMain2Binding
import com.example.ejercicio8pantallarazas.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    final lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.imageView2.setImageResource(R.drawable.humano)
        }

        binding.button2.setOnClickListener {
            binding.imageView2.setImageResource(R.drawable.goblin)
        }

        binding.button3.setOnClickListener {
            binding.imageView2.setImageResource(R.drawable.enano)
        }

        binding.button4.setOnClickListener {
            binding.imageView2.setImageResource(R.drawable.duende)
            val nuevaVista2 = Intent(this, MainActivity3::class.java)
            startActivity(nuevaVista2)
        }
    }
}