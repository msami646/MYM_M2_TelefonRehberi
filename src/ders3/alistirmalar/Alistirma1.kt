package ders3.alistirmalar

import ortak.sepetUrunEkle
import ortak.urunSorgula

fun main() {
    val marketSepeti = mutableListOf<String>()

    sepetUrunEkle(marketSepeti)
    urunSorgula(marketSepeti)


}