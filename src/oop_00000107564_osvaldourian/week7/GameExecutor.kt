package oop_00000107564_osvaldourian.week7

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.SafeZone -> {
            println("🟢 Kamu berada di zona aman. Istirahat sejenak...")
        }
        is BattleState.MonsterEncounter -> {
            println("⚔️  Monster muncul: ${event.monsterName}! Bersiaplah untuk bertarung!")
        }
        is BattleState.LootDropped -> {
            println("🎁 Item drop: ${event.item.name}")
            println("   Damage : ${event.item.damage}")
            println("   Rarity : ${event.item.rarity} (Drop Chance: ${event.item.rarity.dropChance}%)")
        }
        is BattleState.GameOver -> {
            println("💀 Game Over! Alasan: ${event.reason}")
        }
    }
}