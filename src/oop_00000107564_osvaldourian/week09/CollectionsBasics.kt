package oop_00000107564_osvaldourian.week09

fun main() {
    println("=== TEST LIST ===")
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    // frameworks.add("Python") // UNCOMMENT INI AKAN ERROR!
    println("Immutable List: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")
}