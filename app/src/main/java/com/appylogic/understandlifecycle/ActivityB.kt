package com.appylogic.understandlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ActivityB : AppCompatActivity() {

    val TAG="ActivityB"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e(TAG,"OnCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
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