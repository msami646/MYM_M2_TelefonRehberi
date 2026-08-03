package ders1

fun main() {
    print("Doğum yılınızı giriniz")
    val dogumYili = readln().toInt()

    val yas = yasHesapla(dogumYili)

    if (dogumYili < 2026){
        println("Yaşınız: $yas")
    }else{
        println("Lütfen 2026'dan küçük uygun bir değer giriniz")
    }

}

fun yasHesapla(dogumYili: Int): Int {
    val yas = 2026 - dogumYili
    return 2026 - dogumYili
}