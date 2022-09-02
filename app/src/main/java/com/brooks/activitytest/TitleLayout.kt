package com.brooks.activitytest

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout

class TitleLayout(context: Context, attrs: AttributeSet): LinearLayout(context, attrs){
    init {
        LayoutInflater.from(context).inflate(R.layout.title, this)
    }
}