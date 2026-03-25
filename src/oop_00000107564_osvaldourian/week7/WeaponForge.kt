package oop_00000107564_osvaldourian.week7

class Weapon private constructor(val item: GameItem, val durability: Int) {

    companion object {
        fun forgeStarterSword(): Weapon {
            println("Menempa Pedang Kayu Bapuk...")
            return Weapon(
                item = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON),
                durability = 50
            )
        }

        fun forgeEpicSword(): Weapon {
            println("Menempa Pedang Epic...")
            return Weapon(
                item = GameItem("Pedang Naga Merah", 150, ItemRarity.EPIC),
                durability = 200
            )
        }
    }

    override fun toString(): String {
        return "Weapon(name=${item.name}, damage=${item.damage}, " +
                "rarity=${item.rarity}, durability=$durability)"
    }
}