package oop_00000107564_osvaldourian.week4

open class Employee(
    val name: String,
    val baseSalary: Int
) {

    open fun work() {
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        return (0.1 * baseSalary).toInt()
    }
}