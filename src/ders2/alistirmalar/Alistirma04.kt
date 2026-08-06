package ders2.alistirmalar

import ortak.sistemUyarisi

fun main() {
    /*
    Görev 4: Esnek Uyarı Sistemi (Default ve Named Args)

Kullanıcıdan sırasıyla bir uyarı mesajı, bu mesajın bir hata belirtip belirtmediğini (E/H) ve isteğe bağlı bir hata kodu (Int) girmesini isteyin.
 sistemUyarisi adında bir fonksiyon yazın; bu fonksiyon mesajı, hata durumunu (varsayılanı false) ve hata kodunu (varsayılanı 404) parametre alsın.
  Eğer girilen hata kodu geçersiz veya boş ise, fonksiyon çağrısında bu parametreyi tamamen atlayarak varsayılan değerinin çalışmasını
  Named Arguments kullanarak sağlayın.
     */
    print("Bir uyarı mesajı giriniz: ")
    val mesaj = readln()

    print("Bu mesaj bir hata belirtiyor mu(E/H): ")
    val belirtme = readln().uppercase()

    print("Bir hata kodu giriniz: ")
    val hataKodu = readln().toIntOrNull() ?: 0

    val hataDurumu: Boolean
    if (belirtme == "E"){
        hataDurumu = true
    }else{
        hataDurumu = false
    }
    val uyari: String
    if (hataKodu == 0){
        uyari = sistemUyarisi(mesaj,hataDurumu)
    }else{
        uyari = sistemUyarisi(mesaj,hataDurumu,hataKodu)
    }
    println(uyari)
}