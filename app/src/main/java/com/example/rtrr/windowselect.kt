package com.example.rtrr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View

class windowselect : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_windowselect)
        val timer = object : CountDownTimer(3000, 1000)
        {
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                val intent = Intent(this@windowselect,leaderactivity::class.java)
                startActivity(intent)
                finish()
            }
        }
        timer.start()
    }


    fun next(view: View) {
        val intent = Intent(this,leaderactivity::class.java)
        startActivity(intent)
    }
}