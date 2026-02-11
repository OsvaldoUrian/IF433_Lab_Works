package oop_00000107564_osvaldourian.week2

class Jagoan {
    var nama: String = "unknown";
    val hp: Int = 100;

    fun jalan() {
        //codingan untuk jalan
        println("hero jalan kaki ke pasar");
    }
    fun serang(){
        println("hero serang dengan life: $hp");
    }
}

fun main() {
    val hero = Jagoan(); //object nama variabelnya hero
    println("darah hero: ${hero.hp}");
    hero.nama = "Masyaallah";
    hero.jalan();
    hero.serang();
    println(hero.nama);
}