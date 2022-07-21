package com.andrew.bbcnewsapp

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        auth = Firebase.auth

        val loginbtn = findViewById<Button>(R.id.logbutton)
        loginbtn.setOnClickListener {
            performLogin()
        }

        val registertext = findViewById<TextView>(R.id.goToRegister)
        registertext.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        performLogin()
    }
    private fun performLogin() {
        //Lets get input from the user
        val email1: EditText = findViewById(R.id.log_email)
        val password: EditText = findViewById(R.id.log_password)

        //null checks on inputs
        if (email1.text.isEmpty() || password.text.isEmpty()) {
            Toast.makeText(this, "please fill all the fields", Toast.LENGTH_SHORT)
                .show()
            return
        }else{
            title = "Signing in"
            val progressDialog = ProgressDialog(this)
            progressDialog.setTitle("Signing in")
            progressDialog.setMessage("Application is loading, please wait...")
            progressDialog.show()
        }

        val emailinput = email1.text.toString()
        val passwordinput = password.text.toString()

        auth.signInWithEmailAndPassword(emailinput, passwordinput)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success,navigate to the main activity
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)

                    Toast.makeText(
                        baseContext, "Success.",
                        Toast.LENGTH_SHORT
                    ).show()

                } else {
                    // If sign in fails, display a message to the user.

                    Toast.makeText(
                        baseContext, "Authentication failed.",
                        Toast.LENGTH_SHORT
                    ).show()

                }
            }
            .addOnFailureListener {
                Toast.makeText(
                    baseContext, "Authentication failed.${it.localizedMessage}",
                    Toast.LENGTH_SHORT
                ).show()

            }

    }
}