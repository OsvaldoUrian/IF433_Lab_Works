package oop_00000107564_osvaldourian.week7

fun main() {
    // === CHECKPOINT 4: TEST SINGLETON ===
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    // === CHECKPOINT 4: TEST COMPANION OBJECT ===
    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() // Instansiasi lewat Factory
    client.connect()

    // === CHECKPOINT 5: TEST REGULAR CLASS ===
    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1) // Akan mencetak alamat memori hash
    println("Sama? ${reg1 == reg2}") // False

    // === CHECKPOINT 6: TEST DATA CLASS ===
    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1) // Otomatis readable format
    println("Sama? ${data1 == data2}") // True (Structural Equality)
}