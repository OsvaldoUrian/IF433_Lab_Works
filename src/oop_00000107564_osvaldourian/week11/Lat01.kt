package oop_00000107564_osvaldourian.week11

// function extension - basic
fun String.rubah_huruf_depan_jadi_besar(): String {
    var hasil = this.split(delimiters = " ").joinToString(separator = " ") {
        it.replaceFirstChar {
            c -> c.uppercase()
        }
    }

    return "Hai $hasil"
}

fun main() {
    // cara panggil function extension
    println("udin sedunia".rubah_huruf_depan_jadi_besar());
}