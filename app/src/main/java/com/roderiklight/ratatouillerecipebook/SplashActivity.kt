package com.roderiklight.ratatouillerecipebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val i = Intent(this, AuthActivity::class.java)

        val timer = object: CountDownTimer(3000, 1000){
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                startActivity(i)
                finish()
            }
        }
        timer.start()
    }
}