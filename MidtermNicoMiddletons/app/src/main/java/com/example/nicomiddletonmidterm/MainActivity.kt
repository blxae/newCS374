package com.example.nicomiddletonmidterm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.nicomiddletonmidterm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConvert.setOnClickListener {
            convertLitersToGallons()
        }

        // Set developer info
        binding.textViewDeveloper.text = "This app was developed by Nico Middleton"
    }

    private fun convertLitersToGallons() {
        val litersText = binding.editTextLiters.text.toString()
        if (litersText.isNotEmpty()) {
            try {
                val liters = litersText.toDouble()
                val gallons = liters * 0.219
                binding.textViewResult.text = "Result: ${String.format("%.2f", gallons)} gallons"
            } catch (e: NumberFormatException) {
                binding.textViewResult.text = "Please enter a number."
            }
        } else {
            binding.textViewResult.text = "Please enter a value for liters."
        }
    }
}
