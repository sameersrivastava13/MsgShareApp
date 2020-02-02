package com.example.msgshareapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  //attached the layout of activity in main.

        btnShowToast.setOnClickListener{
            //code

            Log.i("MainActivity","Button was clicked")
            //press alt+enter if error is there

            Toast.makeText(this,"You clicked the button.",Toast.LENGTH_SHORT).show()

        }

        button2.setOnClickListener {

            val message: String= edUserMsg.text.toString()
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show()

            //navigate from main activity to second activity

            //intent will be used:- an intention to do something

            val intent=Intent(this,SecondActivity::class.java) //concept of kotlin reflection
            startActivity(intent)



        }
    }


}
