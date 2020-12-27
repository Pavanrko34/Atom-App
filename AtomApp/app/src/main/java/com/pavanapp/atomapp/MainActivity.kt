package com.pavanapp.atomapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window.FEATURE_NO_TITLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.view.Window;
import android.view.WindowManager

class MainActivity : AppCompatActivity() {
    lateinit var txtName: TextView
    lateinit var etName: EditText
    lateinit var btnContinue: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)


        txtName=findViewById(R.id.txtName)
        etName=findViewById(R.id.etName)
        btnContinue=findViewById(R.id.btnContinue)
        val lon=txtName.text.toString()
        btnContinue.setOnClickListener(){
           val intent= Intent(this@MainActivity,homeActivity::class.java)
            startActivity(intent)}


    }
}