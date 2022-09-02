package com.brooks.activitytest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity




open class BaseActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("BaseActivity", javaClass.simpleName)
        ActivityController.addActivity(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("BaseActivity", "onDestroy: " + javaClass.simpleName)
        ActivityController.removeActivity(this)
    }
}