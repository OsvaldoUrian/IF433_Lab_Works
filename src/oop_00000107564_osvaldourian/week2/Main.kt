package oop_00000107564_osvaldourian.week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== APLIKASI PMB UMN ===")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: NIM harus 5 karakter. Pendaftaran dibatalkan.")
        return
    }

    print("Pilih Jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine()

    if (type == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
        val s1 = Student(nim, name, major)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
    } else if (type == 2) {
        val s2 = Student(nim, name)
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
    } else {
        println("Pilihan ngawur, pendaftaran batal!")
    }

    println("\n=== SISTEM PEMINJAMAN BUKU ===")

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama pinjam (hari): ")
    var days = scanner.nextInt()

    if (days < 0) days = 1

    val loan = Loan(title, borrower, days)

    println("\nData Peminjaman:")
    println("Judul Buku : ${loan.bookTitle}")
    println("Peminjam   : ${loan.borrower}")
    println("Durasi     : ${loan.loanDuration} hari")
    println("Total Denda: Rp ${loan.calculateFine()}")

    scanner.nextLine() // bersihkan newline

    println("\n=== MINI RPG BATTLE ===")

    print("Masukkan nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan base damage Hero: ")
    val heroDamage = scanner.nextInt()

    val hero = Hero(heroName, heroDamage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {
        println("\n1. Serang")
        println("2. Kabur")
        print("Pilih: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack("Enemy")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("HP Enemy: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Enemy menyerang balik! Damage: $enemyDamage")
                hero.takeDamage(enemyDamage)
                println("HP ${hero.name}: ${hero.hp}")
            }

        } else {
            println("Kamu kabur dari pertarungan!")
            break
        }
    }

    if (hero.hp > 0 && enemyHp == 0) {
        println("🎉 ${hero.name} MENANG!")
    } else if (enemyHp > 0 && hero.hp == 0) {
        println("Enemy MENANG!")
    }
}
