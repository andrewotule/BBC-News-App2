package com.andrew.bbcnewsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //ASSIGNING TASK TO LOG IN BUTTON
        val loginbtn = findViewById<Button>(R.id.button)
        loginbtn.setOnClickListener{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

    }
}