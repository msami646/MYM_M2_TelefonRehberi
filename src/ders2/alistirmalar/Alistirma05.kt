package ders2.alistirmalar

import ortak.hipetonusKaresiHesaplama

fun main() {
    /*
    Görev 5: Dik Üçgen Hipotenüsü (Fonksiyon İçinde Fonksiyon)

Kullanıcıdan bir dik üçgenin iki dik kenar uzunluğunu (a ve b) tam sayı olarak isteyin ve girdileri çökme korumalı
hale getirin. Bir sayının karesini alan tek satırlık (Single Expression) bir kareHesapla fonksiyonu yazın.
 Ardından dik kenarları parametre alan bir hipotenusKaresiHesapla fonksiyonu tasarlayın.
 Bu ikinci fonksiyon kenarların karelerini hesaplamak yerine, önceden yazdığınız karesini alma fonksiyonunu çağırarak
  işlemleri yapmalı ve iki karenin toplamını döndürmelidir.
     */

    print("Dik üçgenin birinci kenar uzunluğunu giriniz: ")
    val a = readln().toDoubleOrNull() ?: 0.0

    print("Dik üçgenin ikinci kenar uzunluğunu giriniz: ")
    val b = readln().toDoubleOrNull() ?: 0.0

    val c = hipetonusKaresiHesaplama(a,b)
    println("Hipetönüsün Karesi: $c")
}