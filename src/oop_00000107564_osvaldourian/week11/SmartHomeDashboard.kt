package oop_00000107564_osvaldourian.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    // Konfigurasi Pencahayaan
    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    // Konfigurasi Keamanan
    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    // Konfigurasi AC & Kabel
    val ac = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(ac)

    // Tambahkan alat pakan peliharaan
    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))

    // Pencarian Aman dengan let
    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println(it.diagnose())
    }

    // Format Summary dengan with
    println("\n=== DASHBOARD SUMMARY ===")
    with(homeDevices) {
        println("Total perangkat terdaftar: ${this.size}")
    }

    // Kalkulasi Daya dengan run
    val totalPower = homeDevices.run { sumOf { it.powerLoad } }
    println("Total konsumsi daya: $totalPower Watt")

    // Eksekusi Dashboard - iterasi seluruh perangkat
    println("\n=== FULL DEVICE DIAGNOSTICS ===")
    homeDevices.forEach { device ->
        println(device.diagnose())
    }
}