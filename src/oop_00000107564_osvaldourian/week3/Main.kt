package oop_00000107564_osvaldourian.week3

fun main() {
    val e = Employee("Budi")
    println("--- Test Error ---")
    e.salary = 5000   // ini akan membuat program meledak
}
