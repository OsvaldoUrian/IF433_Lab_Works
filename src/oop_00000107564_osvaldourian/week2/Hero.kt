package oop_00000107564_osvaldourian.week2

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100   // default HP
) {

    fun attack(targetName: String) {
        println("$name menyerang $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}