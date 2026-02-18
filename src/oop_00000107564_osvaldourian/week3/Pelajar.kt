package oop_00000107564_osvaldourian.week3

class Pelajar {
    private var nama: String = "belum ada nama"
    private var nilai: Int = 0

    fun set_nama(namaorang: String) {
        if (namaorang.isEmpty()) {
            println("nama orang gak boleh kosong")
        } else {
            this.nama = namaorang
        }
    }

    fun get_nama(): String {
        return this.nama
    }

    fun set_nilai(nilai: Int) {
        if (nilai < 0) {
            println("nilai gak boleh minus")
        } else {
            this.nilai = nilai
        }
    }

    fun get_nilai(): Int {
        return this.nilai
    }
}

fun main() {
    val mahasiswa = Pelajar()
    mahasiswa.set_nama("Osvaldo")
    mahasiswa.set_nilai(100)
    println("Nama kamu: ${mahasiswa.get_nama()}, Nilai: ${mahasiswa.get_nilai()}")
}
