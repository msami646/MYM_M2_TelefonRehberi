package ders4.alistirmalar

import ortak.envanterRaporu

fun main() {
    val urunler = mutableMapOf(
        "Klayve" to 3678.99,
        "Mouse" to 599.99,
        "PC" to 58999.99,
        "MousePad" to 129.99,
        "Monitör" to 8049.99
    )
    envanterRaporu(urunler)

}