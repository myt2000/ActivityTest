package com.brooks.activitytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val fruitList = ArrayList<Fruit>()
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFruits()    // 初始化数据实例
        val adapter = FruitAdapter(this, R.layout.fruit_item, fruitList)
        listView.adapter = adapter
        listView.setOnItemClickListener{ parent, view, position,id ->
            val fruit = fruitList[position]
            Toast.makeText(this, fruit.name, Toast.LENGTH_SHORT).show()
        }
    }

    private fun initFruits(){
        repeat(3){
            fruitList.add(Fruit("Apple", R.drawable.apple))
            fruitList.add(Fruit("Banana", R.drawable.banana))
            fruitList.add(Fruit("Orange", R.drawable.orange))
            fruitList.add(Fruit("WaterMelon", R.drawable.watermelon))
            fruitList.add(Fruit("Grape", R.drawable.grape))
            fruitList.add(Fruit("Pineapple", R.drawable.pineapple))
            fruitList.add(Fruit("Strawberry", R.drawable.strawberry))
        }
    }
}