package com.brooks.activitytest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fruit_item.view.*

class FruitAdapter(val fruitList: List<Fruit>): RecyclerView.Adapter<FruitAdapter.ViewHolder>() {
    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val fruitImage: ImageView = view.fruitImage
        val fruitName: TextView = view.fruitName
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fruit_item, parent, false)
//        val viewHolder = ViewHolder(view)
//        viewHolder.itemView.setOnClickListener {
//            val position = viewHolder.adapterPosition
//            val fruit = fruitList[position]
//            Toast.makeText(parent.context, "you clicked view ${fruit.name}", Toast.LENGTH_SHORT).show()
//        }
//        // 这里fruitImage 必须写成小写
//        viewHolder.fruitImage.setOnClickListener{
//            val position = viewHolder.adapterPosition
//            val fruit = fruitList[position]
//            Toast.makeText(parent.context, "you clicked Image ${fruit.name}", Toast.LENGTH_SHORT).show()
//        }
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fruit = fruitList[position]
        holder.fruitImage.setImageResource(fruit.imageId)
        holder.fruitName.text = fruit.name

        holder.itemView.setOnClickListener {
            val position = holder.adapterPosition
            val fruit = fruitList[position]
            Toast.makeText(holder.itemView.context, "you clicked view ${fruit.name}", Toast.LENGTH_SHORT).show()
        }

        holder.fruitImage.setOnClickListener {
            val position = holder.adapterPosition
            val fruit = fruitList[position]
            Toast.makeText(holder.itemView.context, "you clicked view ${fruit.name}", Toast.LENGTH_SHORT).show()
        }
        // 注：　onCreateViewHolde方法中的parent.context就相当于onBindViewHolder中的holer.itemView.context

    }

    override fun getItemCount() = fruitList.size
}