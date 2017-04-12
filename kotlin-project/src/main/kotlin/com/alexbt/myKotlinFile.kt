package com.alexbt


class MyKotlinClass {
    fun funInsideClass() {
        println("Executing Kotlin funInsideClass()")
    }
}

fun main(args: Array<String>) {
    val javaLib = JavaLib()
    javaLib.execute()
}

fun globalFun() {
    println("Executing Kotlin globalFun()")
}
