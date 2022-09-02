package com.brooks.activitytest

import java.lang.StringBuilder

class Fruits {

}

fun main() {
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
//    val result = with(StringBuilder()) {
//        append("Start eating fruits.\n")
//        for (fruit in list) {
//            append(fruit).append("\n")
//        }
//        append("Ate all fruits.")
//        toString()
//    }
//    val builder = StringBuilder()

//    builder.append("Ate all fruits.")
//    val result = builder.toString()
    val result = StringBuilder().apply {
        append("Start eating fruits.\n")
        for (fruit in list) {
            append(fruit).append("\n")
        }
        append("Ate all fruits")
    }
    println(result.toString())
}

class Util {
    fun doAction1() {
        println("do action1")
    }


    companion object {
        @JvmStatic
        fun doAction2() {
            println("do action2")
        }
    }
}