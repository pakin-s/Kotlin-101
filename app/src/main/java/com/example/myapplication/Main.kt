package com.example.myapplication
//Kotlin-101
fun main () {
    val number: Int = 2
    val i: Byte = number.toByte()
    val s: String = number.toString()
    val f: Float = number.toFloat()

    val e = 35_000_000
    val a = 1_000

    println("Number is $number, i is ${number.toByte()}, s is $s")
    println("e + a = ${e + a}")

    val x = 10
    var y = 10

    y =  11
    println("x is $x, y is $y")

    val c = 78
    val aa = 75

    if (c > 80) {
        println("A")
    } else if (c in 70..79) {
        println("B")
    } else if (c in 60..69) {
        println("C")
    } else {
        println("F")
    }

    when(c) {
        in 80..100 -> println("A")
        in 70..79 -> println("B")
        in 60..69 -> println("C")
        else -> println("F")
    }

    val z = c downTo 0 step 2
    println(z)

}