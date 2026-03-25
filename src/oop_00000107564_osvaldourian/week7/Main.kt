package oop_00000107564_osvaldourian.week7

fun main() {
    // === CHECKPOINT 4: TEST SINGLETON ===
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    // === CHECKPOINT 4: TEST COMPANION OBJECT ===
    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    // === CHECKPOINT 5: TEST REGULAR CLASS ===
    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("Sama? ${reg1 == reg2}") // False

    // === CHECKPOINT 6: TEST DATA CLASS ===
    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}") // True

    // === CHECKPOINT 7: COPY & DESTRUCTURING ===
    println("\n=== TEST COPY & DESTRUCTURING ===")
    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")
    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    // === CHECKPOINT 11: TEST SEALED CLASS ===
    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")
    val uiMessage = when(response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        is ApiResponse.Loading -> "Tampilkan Spinner"
    }
    println(uiMessage)

    // === CHECKPOINT 18: TEST GAME MANAGER SINGLETON ===
    println("\n=== TEST GAME MANAGER SINGLETON ===")
    GameManager.startGame() // Panggilan pertama → mulai game
    GameManager.startGame() // Panggilan kedua → ditolak singleton!

    // === CHECKPOINT 19: TEST RARITY & FACTORY ===
    println("\n=== TEST RARITY & FACTORY ===")

    // Cetak drop chance LEGENDARY
    println("Drop Chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    // Buat senjata awal lewat Factory
    val starterSword = Weapon.forgeStarterSword()
    println("Senjata Awal: $starterSword")

    // === CHECKPOINT 20: TEST COPY & EVENT DISPATCH ===
    println("\n=== TEST COPY & EVENT DISPATCH ===")

    // Upgrade senjata pakai copy() — Immutability!
    val upgradedItem = starterSword.item.copy(damage = 25)
    println("Senjata Diupgrade: $upgradedItem")

    // Simulasi event berurutan
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}
