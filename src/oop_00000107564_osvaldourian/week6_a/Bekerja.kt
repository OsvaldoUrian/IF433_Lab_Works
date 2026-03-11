package oop_00000107564_osvaldourian.week6_a

interface Bekerja {
    public val namaKerjaan:String;
    val gaji:Int;
    val jmlHari:Int;
    val GajiDidapat:Int
        get() = gaji * jmlHari;

    public fun ngoding() {
        println("Kerja ngoding");
    }
}