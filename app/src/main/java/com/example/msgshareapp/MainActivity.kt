package com.example.msgshareapp

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
    }


}
