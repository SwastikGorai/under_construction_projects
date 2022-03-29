package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class opening : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.opening_screen)
    }



    fun abt_author(view :View)
    {
        Toast.makeText(this, "opening info...", Toast.LENGTH_SHORT).show();

        if(view.getId()==R.id.author);
        startActivity(intent);

        val layout = layoutInflater.inflate(R.layout.me, findViewById(R.id.root))

        val myToast = Toast(applicationContext)

            myToast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
            myToast.view = layout//setting the view of custom toast layout
            val countDownTimer = object : CountDownTimer(5000, 1000) {
            override fun onTick(millisUntilFinished: Long) { }
            override fun onFinish() { myToast.cancel() }
        }
            myToast.show()
            countDownTimer.start()

        }

    fun calculator(view :View)
    {
        Toast.makeText(this, "opening calcultor...", Toast.LENGTH_SHORT).show();

        intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)

        if(view.getId()==R.id.calculator);
        startActivity(intent);



    }


}