package oop_00000107564_osvaldourian.week01

fun main() {
    val name = "Osvaldo"
    val score = 80

   println("Nama: $name, Nilai: %score")
    // Tambahkan di bawah println
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89  -> "B"
        in 70..79  -> "C"
        else       -> "D"
    }

    println("Grade kamu: $grade")
