package ders4

fun main() {
    val cekilisKatilimcilari = mutableSetOf<String>()

    cekilisKatilimcilari.add("Ahmet")
    cekilisKatilimcilari.add("Ayşe")

    cekilisKatilimcilari.add("Ahmet")
    cekilisKatilimcilari.add("Ahmet")

    println(cekilisKatilimcilari)

    val katilimciListesi = cekilisKatilimcilari.toList()

    println("İlk tahlihli: ${katilimciListesi[0]}")
}