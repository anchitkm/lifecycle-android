package com.appylogic.understandlifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class ActivityA : AppCompatActivity() {
     val TAG="ActivityA"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e(TAG,"OnCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn_submit).setOnClickListener {
            startActivity(Intent(this,ActivityB::class.java)) // Normal Activity
        }
    }

    override fun onStart() {
        Log.e(TAG,"OnStart")
        super.onStart()
    }

    override fun onRestart() {
        Log.e(TAG,"OnReStart")
        super.onRestart()
    }

    override fun onResume() {
        Log.e(TAG,"OnResume")
        super.onResume()
    }

    override fun onPause() {
        Log.e(TAG,"OnPause")
        super.onPause()
    }

    override fun onStop() {
        Log.e(TAG,"OnStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.e(TAG,"OnDestroy")
        super.onDestroy()
    }
}