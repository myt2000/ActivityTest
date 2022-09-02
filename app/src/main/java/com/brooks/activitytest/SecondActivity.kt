package com.brooks.activitytest

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.brooks.activitytest.databinding.SecondActivityBinding

class SecondActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("SecondActivity", "Task id is $taskId")
        setContentView(R.layout.second_activity)
        val binding = SecondActivityBinding.inflate(layoutInflater)
//        val button2: Button = findViewById(R.id.button2)
        binding.button2.setOnClickListener {
//            SecondActivity.actionStart(this, "data1", "data2")
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }
    // object 表示单例
    companion object {
        fun actionStart(context: Context, data1: String, data2: String) {
            val intent = Intent(context, SecondActivity::class.java).apply {
                putExtra("param1", "data1")
                putExtra("param2", "data2")
            }
            context.startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SecondActivity", "onDestroy: ")
    }
}