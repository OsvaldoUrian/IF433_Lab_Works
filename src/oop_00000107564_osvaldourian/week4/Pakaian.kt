package oop_00000107564_osvaldourian.week4

open class Pakaian {
    private var merk:String = "";
    protected var harga:Int = 0;
    init {
        this.merk = "uniqlo";
        println("merk is $merk");
    }

    open fun jumlah_penjualan() {
        println("Pakaian terjual");
    }
}