package com.example.zoom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnZoomIn = findViewById<Button>(R.id.fadeIn)
        val btnZoomOut = findViewById<Button>(R.id.fadeOut)

        btnZoomIn.setOnClickListener {
            val image = findViewById<ImageView>(R.id.imageView)
            val animation:Animation = AnimationUtils.loadAnimation(this@MainActivity,R.anim.zoom_in)
            image.startAnimation(animation)
        }

        btnZoomOut.setOnClickListener {
            val image = findViewById<ImageView>(R.id.imageView)
            val animation:Animation = AnimationUtils.loadAnimation(this@MainActivity,R.anim.zoom_out)
            image.startAnimation(animation)
        }
    }
}