package oop_00000107564_osvaldourian.week4

fun main() {

    // ===== VEHICLE TEST =====
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    // ===== CAR TEST =====
    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    // ===== ELECTRIC CAR TEST =====
    println("\n--- Testing Electric Car ---")
    val tesla = ElectricCar("Tesla", 4, 85)
    tesla.accelerate()
    tesla.honk()
    tesla.openTrunk()

    // ===== EMPLOYEE HIERARCHY TEST =====
    println("\n--- Testing Employee Hierarchy ---")

    val manager = Manager("Budi", 10000000)
    val developer = Developer("Andi", 8000000, "Kotlin")

    // Manager
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    // Developer
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}