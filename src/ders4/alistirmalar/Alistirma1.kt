package ders4.alistirmalar

import ortak.cekilisRaporuOlustur
import ortak.davetliEkle

fun main() {
    val davetliMisafir = mutableSetOf<String>()

    davetliEkle(davetliMisafir)
    cekilisRaporuOlustur(davetliMisafir)
}