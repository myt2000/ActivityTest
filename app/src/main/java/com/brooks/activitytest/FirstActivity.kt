package com.brooks.activitytest

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.brooks.activitytest.databinding.FirstLayoutBinding


class FirstActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("FirstActivity", "Task id is $taskId")
        setContentView(R.layout.first_layout)
        val binding = FirstLayoutBinding.inflate(layoutInflater)
//        val button1: Button = findViewById(R.id.button1)
//        val last = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
//            val data = it.data
//            val resultCode = it.resultCode
//        }.launch(intent)

        binding.button1.setOnClickListener {
            SecondActivity.actionStart(this, "data1", "data2")
//            val intent = Intent(this, SecondActivity::class.java)
//            startActivity(intent)
//            startActivityForResult(intent, 1)

        }
        // 显式Intent
//        val intent = Intent(this, SecondActivity::class.java)
//        startActivity(intent)
        // 隐式Intent
//        val intent = Intent("com.brooks.activitytest.ACTION_START" )
//        intent.addCategory("com.brooks.activitytest.MY_CATEGORY")
//        intent.data = Uri.parse("tel:10086")
//        startActivity(intent)
    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        when (requestCode) {
//            1 -> if (resultCode == RESULT_OK) {
//                val returnedData = data?.getStringExtra("data_return")
//                Log.d("FirstActivity", "returned data is $returnedData")
//            }
//        }
//    }
//
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.main, menu)
//        return true;
//    }

    override fun onRestart() {
        super.onRestart()
        Log.d("FirstActivity", "onRestart: ")
    }
}