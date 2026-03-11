package oop_00000107564_osvaldourian.week6_a

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat '${device.name}' berhasil ditambahkan ke Hub.")
    }

    fun turnOffAllSwitches() {
        println("\n--- Mematikan semua perangkat ---")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff() // smart cast otomatis jadi Switchable
            }
        }
    }
}