package ders1.alistirmalar

fun main() {
    /*
    🏆 Görev 2 – Oyuncu Skor Kartı (Parametreli): Kullanıcıdan oyuncu adını ve kazandığı puanı konsoldan isteyin.
    Girilen puanın harf veya boş olması durumunda çökmesini engelleyerek varsayılan bir puan atayın.
     Ardından bu bilgileri parametre olarak alan ve ekrana şık bir skor tablosu yazdıran bir fonksiyon tasarlayın.
     */
    print("Oyuncu adını giriniz: ")
    val oyuncuAdi = readln()

    print("Kazandığınız puanı giriniz: ")
    val puan = readln().toIntOrNull() ?: 0

    oyuncuBilgileriYazdirma(oyuncuAdi, puan)

}

fun oyuncuBilgileriYazdirma(oyuncuIsmi: String, puan: Int) {
    println(
        """
Oyuncu İsmi: $oyuncuIsmi
Kazanan Puan: $puan
    """
    )

}