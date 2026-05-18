package oop_00000107564_osvaldourian.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}