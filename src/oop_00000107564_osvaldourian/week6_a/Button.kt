package oop_00000107564_osvaldourian.week6_a

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}