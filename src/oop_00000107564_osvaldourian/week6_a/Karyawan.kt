package oop_00000107564_osvaldourian.week6_a

class Karyawan(
    override val namaKerjaan: String,
    override val gaji: Int,
    override val jmlHari: Int
):Bekerja {
    override fun ngoding() {
        println("kerjaan kamu $namaKerjaan");
        println("Gaji kamu ${super.GajiDidapat}");
    }

}