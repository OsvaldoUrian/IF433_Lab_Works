package oop_00000107564_osvaldourian.week12

import java.io.DataInput
import java.text.NumberFormat

fun basic_trycatch(pembilang: Int, penyebut: Int){
    try {
        val hasil = pembilang / penyebut
        println("Hasil bagi $hasil")
    } catch (e: Exception) {
        println("Ada error pembagian ${e.message}")
    } finally {
        println("Selesai pembagian")
    }
}

fun cekTipeData(angka: String) {
    var nilai: Int = try {
        Integer.parseInt(angka)
    } catch (e: Exception) {
        println("Ada error di cek tipe data ${e.message}")
        123
    }
    println("Nilai kamu $nilai")
}

fun cekGaji (hariKerja: Int) {
    if (hariKerja < 0) {
        throw IllegalArgumentException("Masa Hari kerja minus")
    } else {
        val gaji = hariKerja * 1000;
        println("Gaji kamu $gaji")
    }
}

// Custom Exception -> Class
class cekSaldoBank(val saldoKamu: Int, val jajanKamu: Int):
    Exception("Saldo kamu $saldoKamu, jajan kamu $jajanKamu, gak cukup lahh!!!")

class transaksiPembelian(val saldoAwal: Int) {
    fun mulaiJajan(pengeluaranKamu: Int) {
        if(saldoAwal < pengeluaranKamu) {
            throw cekSaldoBank(saldoAwal, pengeluaranKamu)
        } else {
            val sisaSaldo = saldoAwal - pengeluaranKamu
            println("Sisa saldo kamu $sisaSaldo")
        }
    }
}

//multiple catch
fun multi_catch(input:String, penyebut:Int) {
    try {
        val num: Int = input.toInt()
        println("Hasil pembagian adalah ${num / penyebut}")

    }
    catch (e: NumberFormatException){
        println("ada error multicatch, salah format: ${e.message}")
    }

    catch (e: ArithmeticException){
        println("ada error multicatch, aritmatika : ${e.message}")
    }

    catch (e: Exception){
        println("ada error multicatch, errornya adalh: ${e.message}")
    }
}

sealed class ATMException(val pesan: String): Exception(pesan)

class cek_saldo(val saldo:Int): ATMException("Saldo kamu ga cukup, karena sisa $saldo")
class batas_jajan(val amount: Int): ATMException("Batas jajan kamu $amount")

fun mulau_jajan(saldoSaya:Int, jajanSaya:Int):Int {
    if (jajanSaya > 1000) {
        throw batas_jajan(jajanSaya);

    } else if (saldoSaya < jajanSaya ) {
        throw cek_saldo(saldoSaya);
    } else {
        println("Sisa saldo kamu adalah ${saldoSaya - jajanSaya }")
    }
    return saldoSaya - jajanSaya;
}

fun main() {

    runCatching { mulau_jajan(1200, 800)}
        .onSuccess { println("Transaksi Sukses ${it}") }
        .onFailure { println("Transaksi Gagal ${it.message}") }



    multi_catch( input = "10", penyebut = 0);

    val trx = transaksiPembelian(1000)
    try {
        trx.mulaiJajan(1200)
    } catch (e: Exception) {
        println("Ada error di custom exception ::: ${e.message}")
    }

    // Coba Throw
    try {
        cekGaji(22)
    } catch (e: IllegalArgumentException) {
        println("error coba catch ::: ${e.message}")
    }

    // Exception - Expression
    cekTipeData("29")

    // Basic Expression
    basic_trycatch(10, 2)
}