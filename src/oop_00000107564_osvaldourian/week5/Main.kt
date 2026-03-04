package oop_00000107564_osvaldourian.week5

fun main() {

    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    // Polymorphic Collection: List yang berisi tipe Parent, tapi isinya objek Anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")

    for (pegawai in daftarPegawai) {

        // Pemanggilan Runtime Polymorphism
        pegawai.bekerja()

        // Smart Casting dengan is dan when
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }

            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }

        println("----------------------------")
    }

    println("\n=== UJI MATHHELPER (OVERLOADING) ===")
    val math = MathHelper()

    val luasPersegi = math.hitungLuas(5)
    println("Luas Persegi (sisi=5): $luasPersegi")

    val luasPersegiPanjang = math.hitungLuas(4, 7)
    println("Luas Persegi Panjang (4x7): $luasPersegiPanjang")

    val luasLingkaran = math.hitungLuas(3.5)
    println("Luas Lingkaran (r=3.5): $luasLingkaran")
}