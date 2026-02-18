package oop_00000107564_osvaldourian.week3

class Employee(val name: String) {

    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            // KODE SALAH (sengaja)
            this.salary = value   // ini memanggil setter lagi → infinite recursion
        }
}
