package com.brooks.activitytest

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.fruit_item.view.*

class FruitAdapter(activity: Activity, private val resourceId: Int, data: List<Fruit>) : ArrayAdapter<Fruit>(activity, resourceId, data){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(context).inflate(resourceId, parent, false)
//        val fruitImage: ImageView = view.findViewById(R.id.fruitImage)
        val fruitImage: ImageView = view.fruitImage
//        val fruitName: TextView = view.findViewById(R.id.fruitName)
        val fruitName: TextView = view.fruitName
        val fruit = getItem(position) // 获取当前项的Fruit实例
        if(fruit != null){
            fruitImage.setImageResource(fruit.imageId)
            fruitName.text = fruit.name
        }
        return view
    }
}