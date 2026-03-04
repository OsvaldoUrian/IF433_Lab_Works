package oop_00000107564_osvaldourian.week5

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}