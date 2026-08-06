package ders2.alistirmalar

import ortak.daireAlanHesaplama
import ortak.daireAlanHesaplama

fun main() {
    /*
    Görev 3: Tek Satırlık Matematik (Single Expression)

    Kullanıcıdan bir yarıçap (Int) değeri isteyin ve girdiyi çökme korumalı hale getirin. D
    airenin alanını (3.14 * r * r) hesaplayıp geriye ondalıklı (Double) olarak döndüren
    bir fonksiyon yazın. Bu fonksiyonu süslü parantez veya return anahtar kelimesi kullanmadan,
     tamamen tek satırda (Single Expression) tasarlayın.
     */
    println("DAİRE ALAN HESAPLAMA")
    print("Dairenin yarı çapını giriniz: ")
    val yaricap = readln().toDoubleOrNull() ?: 0.0

    val daireAlan = daireAlanHesaplama(yaricap)
    println("Dairenin Alanı: $daireAlan")
}