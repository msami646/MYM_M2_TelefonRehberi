package ders1.alistirmalar

fun main() {
    /*
    🔢 Görev 4 – Tek mi, Çift mi? (Koşullu Kontrol): Kullanıcıdan bir tam sayı isteyin (çökme koruması uygulayın).
     Sayıyı alıp çift ise geriye true, tek ise false döndüren bir fonksiyon yazın.
     Fonksiyondan dönen bu Boolean değeri ana programda bir if koşulu içerisinde sınayarak ekrana özel durum mesajı bastırın.
     */
    print("Bir tam sayı değeri giriniz: ")
    val tamSayi = readln().toIntOrNull() ?: 0
    if (tekMiCiftMi(tamSayi)){
        println("Tam sayı çift.")
    }else {
        println("Tam sayı tek.")
    }


}
fun tekMiCiftMi (tamSayi: Int): Boolean {
    return tamSayi % 2 == 0
}