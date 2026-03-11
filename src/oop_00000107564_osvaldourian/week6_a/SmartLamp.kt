package oop_00000107564_osvaldourian.week6_a

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Lampu '$name' menyala.")
    }

    override fun turnOff() {
        println("Lampu '$name' dimatikan.")
    }
}