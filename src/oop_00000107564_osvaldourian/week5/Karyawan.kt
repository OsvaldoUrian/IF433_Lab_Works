package oop_00000107564_osvaldourian.week5

abstract class Karyawan {
    val nama:String = "Budi";
    abstract fun bekerja(kecepatan:Int): String;

    fun terima_gaji() {
        println("hore gajian");
    }
}

class Staff: Karyawan() {
    override fun bekerja(kecepatan: Int): String {
        return "Staff ngetik, kecepatan $kecepatan";
    }
}

class Manager: Karyawan() {
    override fun bekerja(kecepatan: Int): String {
        return "Manager mengawasi $kecepatan km/jam";
    }
}

fun main() {
    val staf = Staff();
    println("staff kerja: ${staf.bekerja(kecepatan = 7)}");

    val mgr = Manager();
    println("Manager kerja: " + mgr.bekerja(kecepatan = 12));
}