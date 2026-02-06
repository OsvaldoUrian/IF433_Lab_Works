package oop_00000107564_osvaldourian.week1

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750000

    val finalPrice = calculateDiscount(price)

    println(gameTitle)
    println(finalPrice)
}

fun calculateDiscount(price: Int) =
    if (price > 500000)
        (price * 0.8).toInt()
    else
        (price * 0.9).toInt()
