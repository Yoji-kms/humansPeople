package ru.netology

import java.lang.NumberFormatException

fun main() {
    var likes: Int

    while (true) {
        print("Введите количество лайков: ")
        try {
            likes = readLine()?.toInt()!!
            break
        } catch (e: NumberFormatException) {
            e.printStackTrace()
            println("Некорректный ввод!")
        }
    }

    val likesDivTen = likes % 10
    val likesDivHundred = likes % 100

    if (likesDivTen == 1 && likesDivHundred != 11) println("Понравилось $likes человеку")
    else println("Понравилось $likes людям")
}