package com.brooks.activitytest


import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.brooks.activitytest.databinding.ThirdActivityBinding

class ThirdActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ThirdActivity", "task id is $taskId")
        setContentView(R.layout.third_activity)
        val binding = ThirdActivityBinding.inflate(layoutInflater)
//        val button3: Button = findViewById(R.id.button3)
        binding.button3.setOnClickListener{
            ActivityController.finishAll()
            android.os.Process.killProcess(android.os.Process.myPid())
        }
    }
}