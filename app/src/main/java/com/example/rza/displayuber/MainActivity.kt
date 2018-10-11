package com.example.rza.displayuber

import android.app.Activity
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)

        val time = 30_000L

        val handler = Handler()
        handler.postDelayed({
            closeApp()
        }, time)
    }

    private fun closeApp() {
        this.finishAndRemoveTask()
    }

    override fun onResume() {
        super.onResume()
        uberImageHolder.setImageResource(R.drawable.uber)

        val player = MediaPlayer.create(this, R.raw.success)
        player.start()
    }
}
