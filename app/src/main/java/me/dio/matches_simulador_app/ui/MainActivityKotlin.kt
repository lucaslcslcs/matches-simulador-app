package me.dio.matches_simulador_app.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.dio.matches_simulador_app.databinding.ActivityMainBinding

class MainActivityKotlin : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_main)
        //val tvHello : TextView = findViewById<TextView>(R.id.tvHello)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}