package com.example.nicomiddletonmidterm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.nicomiddletonmidterm.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up the text with information about the app
        val aboutText = """
            This app allows you to convert liters to gallons.
            
            The usage is simple and easy. 
            
            To use the app:
            1. Enter the value of liters in the text box provided.
            2. Click on the button.
            3. Get your result.
            
            Thank you for using the app!
        """.trimIndent()

        binding.textViewAbout.text = aboutText
    }
}
