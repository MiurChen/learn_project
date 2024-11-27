package org.example

//請設計一個Kotlin程式，來判斷學生的成績等級。
//使用者輸入一個整數作為學生的分數 (0到100之間)。
//根據輸入的分數，判斷並輸出對應的等級：
//90 到 100 分：輸出“A”等級
//80 到 89 分：輸出“B”等級
//70 到 79 分：輸出“C”等級
//60 到 69 分：輸出“D”等級
//0 到 59 分：輸出“F”等級
//如果輸入的分數不在 0 到 100 之間，請輸出“無效的分數”。

//方法一
//fun main(){
//    print("請輸入學生分數(0~100):")
//
//    var score = readln().toInt()
//
//    if (score in 90..100){
//        println("A")
//    }
//    else if (score in 80 until 90){
//        println("B")
//    }
//    else if (score in 70 until 80){
//        println("C")
//    }
//    else if (score in 60 until 70){
//        println("D")
//    }
//    else if (score in 0 until 60){
//        println("F")
//    }
//    else {
//        print("無效的分數")
//    }
//}

//方法二
fun main(){
    print("請輸入學生分數(0~100):")

    var score = readln().toInt()

    val level = when (score){
        in 90..100 -> "A"
        in 80 until 90 -> "B"
        in 70 until 80 -> "C"
        in 60 until 70 -> "D"
        in 0 until 60 -> "F"
        else -> "無效的分數"
    }

    println(level)
}
print("你好呀")
