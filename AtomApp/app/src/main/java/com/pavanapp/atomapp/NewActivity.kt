package com.pavanapp.atomapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.pavanapp.atomapp.R.id.btnGuest

class NewActivity : AppCompatActivity() {

    lateinit var imgfirst: ImageView
    lateinit var txtMeditation: TextView
    lateinit var btnGoogle: Button
    lateinit var btnGuest: Button
    lateinit var txtTerms: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        title="Login"
        imgfirst =findViewById(R.id.imgfirst)
        txtMeditation=findViewById(R.id.txtMeditation)
        btnGoogle =findViewById(R.id.btnGoogle)
        btnGuest=findViewById(R.id.btnGuest)
        txtTerms=findViewById(R.id.txtTerms)


        btnGoogle.setOnClickListener(){
            Toast.makeText(this@NewActivity,"Please continue as a guest first",Toast.LENGTH_LONG).show()

        }
        btnGuest.setOnClickListener(){

            val intent= Intent(this@NewActivity,MainActivity::class.java)
            startActivity(intent)
        }


    }
}
