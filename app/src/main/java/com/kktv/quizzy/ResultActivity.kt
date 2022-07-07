package com.kktv.quizzy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("Finished quiz", "Bruh")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName: TextView = findViewById(R.id.tv_username)
        val tvScore: TextView = findViewById(R.id.score)
        val btnFinish: Button = findViewById(R.id.btn_finish)

        tvName.text = intent.getStringExtra(Constants.USER_NAME)

        val totalQs: Int = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctQs: Int = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        val temp: String = "You scored $correctQs / $totalQs"
        tvScore.text = temp

        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }


    }



}