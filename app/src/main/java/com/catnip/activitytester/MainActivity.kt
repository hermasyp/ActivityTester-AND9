package com.catnip.activitytester

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.catnip.activitytester.model.Student

class MainActivity : AppCompatActivity() {
    private val TAG = MainActivity::class.simpleName
    private lateinit var btnNavigate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindViews()
        setClickListeners()
        Log.d(TAG, "onCreate: ")
    }

    private fun bindViews() {
        btnNavigate = findViewById(R.id.btn_navigate)
    }

    private fun setClickListeners() {
        btnNavigate.setOnClickListener {
            //todo : navigate to second activity
            navigateToSecondActivity()
        }
    }
    private fun navigateToSecondActivity() {
        val intent = Intent(this,SecondActivity::class.java)
        val student = Student(1,"Ujang Stark","4IA01")
        // sending some message with value "Hello, this is a Message from MainActivity"
        intent.putExtra(
            SecondActivity.EXTRAS_MESSAGE,
            "Hello, this is a Message from $TAG")
        intent.putExtra(SecondActivity.EXTRAS_STUDENT_DATA,student)
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
    }
    
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
    }

}