package oop_00000107564_osvaldourian.week01

fun calculateStatus(score: Int) =
    if (score > 75) "Lulus" else "Tidak Lulus"

fun main() {
    val name = "Osvaldo"
    val score = 80

    println("Nama: $name, Nilai: $score")

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89  -> "B"
        in 70..79  -> "C"
        else       -> "D"
    }

    println("Grade kamu: $grade")
    println("Status: ${calculateStatus(score)}")
}
