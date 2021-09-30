package com.fil.stepgo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isInvisible

class MainActivity : AppCompatActivity() {

    
    private lateinit var FnameEditText: EditText
    private lateinit var MNameEditText: EditText
    private lateinit var LNameEditText: EditText
    private lateinit var PhonNoEditText: EditText
    private lateinit var EmailEditText: EditText
    private lateinit var heightEditTextDecimal: EditText
    private lateinit var WeightEditTextDecimal: EditText
    private lateinit var DateEditText: EditText
//    private lateinit var spinner: EditText
    private lateinit var btnSubmit: Button



    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FnameEditText = findViewById(R.id.FnameEditText)
        MNameEditText = findViewById(R.id.MNameEditText)
        LNameEditText = findViewById(R.id.LNameEditText)
        PhonNoEditText = findViewById(R.id.PhonNoEditText)
        EmailEditText = findViewById(R.id.EmailEditText)
        heightEditTextDecimal = findViewById(R.id.heightEditTextDecimal)
        WeightEditTextDecimal = findViewById(R.id.WeightEditTextDecimal)
        DateEditText = findViewById(R.id.DateEditText)
//        spinner = findViewById(R.id.spinner)
        btnSubmit = findViewById(R.id.btnSubmit)

        btnSubmit.setOnClickListener{
            val f_name = FnameEditText.text.toString().trim()
            val m_name = MNameEditText.text.toString().trim()
            val l_name = LNameEditText.text.toString().trim()
            val phone = PhonNoEditText.text.toString().trim()
            val email = EmailEditText.text.toString().trim()
            val height = heightEditTextDecimal.text.toString().trim()
            val weight = WeightEditTextDecimal.text.toString().trim()
            val date = DateEditText.text.toString().trim()
            // val spinner = spinner.text.toString().trim()


            if(f_name.isEmpty()){
              FnameEditText.error = "First Name Required"
                return@setOnClickListener
            }
            else if(m_name.isEmpty()) {
                MNameEditText.error = "Last Name Required"
                return@setOnClickListener
            }
            else if(l_name.isEmpty()) {
                LNameEditText.error = "Last Name Required"
                return@setOnClickListener
            }
            else if(phone.isEmpty()) {
                PhonNoEditText.error = "Phone Required"
                return@setOnClickListener
            }
            else if(email.isEmpty()) {
                EmailEditText.error = "Email Required"
                return@setOnClickListener
            }
            else if(height.isEmpty()) {
                heightEditTextDecimal.error = "Height Required"
                return@setOnClickListener
            }
            else if(weight.isEmpty()) {
                WeightEditTextDecimal.error = "Weight Required"
                return@setOnClickListener
            }
            else if(date.isEmpty()) {
                DateEditText.error = "Date Required"
                return@setOnClickListener
            }

            else if(!(f_name.isEmpty() && m_name.isEmpty() && l_name.isEmpty() && phone.isEmpty() && email.isEmpty() && height.isEmpty() && weight.isEmpty() && date.isEmpty())){
                FnameEditText.isInvisible=true
                MNameEditText.isInvisible=true
                LNameEditText.isInvisible=true
                PhonNoEditText.isInvisible=true
                EmailEditText.isInvisible=true
                heightEditTextDecimal.isInvisible=true
                WeightEditTextDecimal.isInvisible=true
                DateEditText.isInvisible=true

            }

        }
    }
}

