package com.example.laboratorul1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    //private var user_field: EditText? = null
    //private var main_btn:  Button? = null
    //private var result_info: TextView? = null



    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      val userfield = findViewById<EditText>(R.id.userfield)
      val mainbtn = findViewById<Button>(R.id.mainbtn)
      val resultinfo = findViewById<TextView>(R.id.resultinfo)

        mainbtn?.setOnClickListener {
            if(userfield?.text?.toString()?.trim()?.equals("")!!)
                Toast.makeText(this,"Introduceti textul", Toast.LENGTH_LONG).show()
            else {
                var cuvinte  = 0
                for( cuvint in userfield.text.toString().split(" ")){
                    if(cuvint.contains('a')|| cuvint.contains('A'))cuvinte++
                }
                resultinfo?.text = "Cuvintele cu litera  a/A: $cuvinte"
                 }
            }

        }

    }













