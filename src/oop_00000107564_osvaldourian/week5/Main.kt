package oop_00000107564_osvaldourian.week5

fun main() {

    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")

    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

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

    // CHECKPOINT 6: Test MathHelper Overloading
    println("\n=== UJI MATHHELPER (OVERLOADING) ===")
    val math = MathHelper()

    val luasPersegi = math.hitungLuas(5)
    println("Luas Persegi (sisi=5): $luasPersegi")

    val luasPersegiPanjang = math.hitungLuas(4, 7)
    println("Luas Persegi Panjang (4x7): $luasPersegiPanjang")

    val luasLingkaran = math.hitungLuas(3.5)
    println("Luas Lingkaran (r=3.5): $luasLingkaran")

    // CHECKPOINT 10: Payment Polymorphism
    println("\n=== SISTEM PEMBAYARAN ===")
    val ewallet = EWallet(accountName = "Osvaldo", balance = 50000.0)
    val creditCard = CreditCard(accountName = "Osvaldo", limit = 100000.0)

    val daftarPembayaran: List<PaymentMethod> = listOf(ewallet, creditCard)

    for (metode in daftarPembayaran) {
        metode.processPayment(75000.0)
        println("----------------------------")
    }
}