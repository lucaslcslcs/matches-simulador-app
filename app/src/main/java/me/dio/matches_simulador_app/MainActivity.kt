package me.dio.matches_simulador_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import me.dio.matches_simulador_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_main)
        //val tvHello : TextView = findViewById<TextView>(R.id.tvHello)

        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.tvHello.text = "Teste"
    }
}