package oop_00000107564_osvaldourian.week5

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] Pembayaran Kartu Kredit Rp$amount berhasil. Terpakai: Rp$usedAmount / Rp$limit")
        } else {
            println("[$accountName] Transaksi ditolak. Melebihi limit kartu kredit.")
        }
    }
}