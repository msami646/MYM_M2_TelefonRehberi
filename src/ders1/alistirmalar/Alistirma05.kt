package ders1.alistirmalar

fun main() {
    /*
    🔄 Görev 5 – Adım Adım Kare Hesaplama (Döngü Entegrasyonu): Kullanıcıdan bir sınır sayısı (Int) isteyin (çökme koruması uygulayın).
    Geriye gönderilen sayının karesini hesaplayıp döndüren bir fonksiyon tasarlayın.
     Ana programda (main) 1’den kullanıcının girdiği sınır sayısına kadar dönen bir for döngüsü kurun ve
     döngünün her adımında bu fonksiyonu çağırarak sayıların karelerini ekrana listeyin.
     */
    print("Bir sınır sayısı giriniz: ")
    val sinirSayisi = readln().toIntOrNull() ?: 0
    for (sayi in 1 .. sinirSayisi){
        val kare = kareHesaplama(sayi)
        println("$sayi sayısının karesi: $kare")
    }

}
fun kareHesaplama (sayi:Int):Int{
    return sayi*sayi
}