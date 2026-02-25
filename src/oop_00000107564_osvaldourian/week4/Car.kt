package oop_00000107564_osvaldourian.week4

open class Car(
    brand: String,
    val numberOfDoors: Int
) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }

    override fun accelerate() {
        super.accelerate() // Memanggil logic dari parent
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")
    }
}