package com.learnkotlin.androidartifactoryconsumer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.learnkotlin.canvasglasslibrary.CanvasGlass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onPostResume() {
        super.onPostResume()

        Handler().postDelayed( {
            val imageview = findViewById<CanvasGlass>(R.id.imageview)
            imageview.setOverlayResource(R.drawable.pic_color)
            imageview.setBoxSize(R.dimen.newbox_size)
            imageview.setBoxStroke(R.dimen.newstroke)
        }, 2000)
    }
}
