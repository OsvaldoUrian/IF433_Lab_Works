package oop_00000107564_osvaldourian.week3

fun main() {
    val e = Employee("Budi")

    // 1. Test Validasi Salary
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    // 2. Test Encapsulation
    e.increasePerformance()

    // 3. Test Computed Property
    println("Pajak yang harus dibayar: ${e.tax}")

    println("\n=== TEST WEAPON ===")

    val weapon = Weapon("Excalibur", 9000)

    // Damage negatif (harus gagal)
    weapon.damage = -50

    // Damage overpowered (harus jadi 1000)
    weapon.damage = 9999

    println("Weapon: ${weapon.name}")
    println("Damage: ${weapon.damage}")
    println("Tier: ${weapon.tier}")

    println("\n=== TEST PLAYER ===")

    val player = Player("Osvaldo")

    player.addXp(50)   // masih level 1
    println("Level sekarang: ${player.level}")

    player.addXp(60)   // total 110 -> harus naik ke level 2
    println("Level sekarang: ${player.level}")
}
