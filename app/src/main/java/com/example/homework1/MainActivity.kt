package com.example.homework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_1.setOnClickListener{
            if(edit_Login.text.toString().equals("icarus")
                    && edit_Password.text.toString().equals("fallen"))
            {
                showText()
            }
        }
    }
    private fun showText(){
        text_view.text = "It is so sad "
    }
}