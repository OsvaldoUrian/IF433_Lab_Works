package oop_00000107564_osvaldourian.week5

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {

    // WAJIB override karena parent abstract
    override fun bekerja() {
        println("$nama sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
    }

    // Fungsi khusus milik Dosen
    fun mengajar() {
        println("$nama sedang mengajar mahasiswa di kelas.")
    }
}