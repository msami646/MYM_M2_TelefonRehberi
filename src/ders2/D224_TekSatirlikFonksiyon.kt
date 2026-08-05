package ders2

fun main() {
    var kare = kareHesapla(5)
    println("Sayının Karesi: $kare")
     kare = kareHesaplaKisa(7)
    println("Sayının Karesi: $kare")


}

fun kareHesapla(sayi: Int): Int{
    return sayi * sayi
}

fun kareHesaplaKisa(sayi: Int) = sayi * sayi