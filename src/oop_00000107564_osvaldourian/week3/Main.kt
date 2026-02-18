package oop_00000107564_osvaldourian.week3

fun main() {
    val e = Employee("Budi")

    println("--- Test Salary ---")
    e.salary = -100
    e.salary = 5000

    println("\n--- Test Performance ---")
    e.printStatus()
    e.increasePerformance()
    e.printStatus()
}
