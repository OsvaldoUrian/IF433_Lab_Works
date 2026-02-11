package oop_00000107564_osvaldourian.week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== APLIKASI PMB UMN ===")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.nextLine()

    // Validasi NIM
    if (nim.length != 5) {
        println("ERROR: NIM harus 5 karakter. Pendaftaran dibatalkan.")
        return
    }

    print("Pilih Jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine() // consume newline

    if (type == 1) {
        // Primary constructor
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(nim, name, major)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")

    } else if (type == 2) {
        // Secondary constructor
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

    // Validasi: tidak boleh minus
    if (days < 0) {
        days = 1
    }

    val loan = Loan(title, borrower, days)

    println("\nData Peminjaman:")
    println("Judul Buku : ${loan.bookTitle}")
    println("Peminjam   : ${loan.borrower}")
    println("Durasi     : ${loan.loanDuration} hari")
    println("Total Denda: Rp ${loan.calculateFine()}")
}