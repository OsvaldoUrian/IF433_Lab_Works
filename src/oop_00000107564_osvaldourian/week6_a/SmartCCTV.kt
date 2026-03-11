package oop_00000107564_osvaldourian.week6_a

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("CCTV '$name' menyala.")
        startRecord() // otomatis mulai rekam saat dinyalakan!
    }

    override fun turnOff() {
        println("CCTV '$name' dimatikan.")
    }

    override fun startRecord() {
        println("CCTV '$name' mulai merekam...")
    }
}