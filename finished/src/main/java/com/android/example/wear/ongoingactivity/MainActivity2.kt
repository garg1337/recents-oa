package com.android.example.wear.ongoingactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.android.example.wear.ongoingactivity.databinding.ActivityMain2Binding

class MainActivity2 : ComponentActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}