package oop_00000107564_osvaldourian.week4

class Baju:Pakaian() {
    private var stock:Int = 10;
    public fun update_stock() {
        super.harga = stock * 100;
        println("Stock $stock baju terupdate" + "harga ${super.harga}");
    }
    override public fun jumlah_penjualan() {
        println("Baju terjual");
    }
}