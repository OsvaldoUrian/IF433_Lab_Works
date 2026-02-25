package oop_00000107564_osvaldourian.week4

// Car "Is-A" Vehicle
open class Car(
    brand: String,
    val numberOfDoors: Int
) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
}