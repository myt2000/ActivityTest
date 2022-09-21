package com.brooks.activitytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val fruitList = ArrayList<Fruit>()
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFruits()    // 初始化数据实例
        val layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
        val adapter = FruitAdapter(fruitList)
        recyclerView.adapter = adapter
    }

    private fun initFruits(){
        repeat(5){
            fruitList.add(Fruit(getRandomLengthString("Apple"), R.drawable.apple))
            fruitList.add(Fruit(getRandomLengthString("Banana"), R.drawable.banana))
            fruitList.add(Fruit(getRandomLengthString("Orange"), R.drawable.orange))
            fruitList.add(Fruit(getRandomLengthString("WaterMelon"), R.drawable.watermelon))
            fruitList.add(Fruit(getRandomLengthString("Grape"), R.drawable.grape))
            fruitList.add(Fruit(getRandomLengthString("Pineapple"), R.drawable.pineapple))
            fruitList.add(Fruit(getRandomLengthString("Strawberry"), R.drawable.strawberry))
        }
    }

    private fun getRandomLengthString(str: String): String{
        val n = (1..20).random()
        val builder = StringBuilder()
        repeat(n){
            builder.append(str)
        }
        return builder.toString()
    }

}