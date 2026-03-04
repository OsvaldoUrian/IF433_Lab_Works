package oop_00000107564_osvaldourian.week5

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran E-Wallet Rp$amount berhasil. Sisa saldo: Rp$balance")
        } else {
            println("[$accountName] Saldo tidak cukup. Saldo saat ini: Rp$balance")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Top up Rp$amount berhasil. Saldo sekarang: Rp$balance")
    }
}