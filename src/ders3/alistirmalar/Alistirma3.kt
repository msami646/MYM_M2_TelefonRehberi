package ders3.alistirmalar

fun main() {
    val sayilarListe = IntArray(5)
    for(i in 0 until sayilarListe.size){
        print("${i + 1}. sayıyı giriniz: ")
        val sayi = readln().toIntOrNull()?: 0
        sayilarListe[i] = sayi
    }
    val yazilacakSayilar = sayilarListe.sort()
    println(yazilacakSayilar)
}