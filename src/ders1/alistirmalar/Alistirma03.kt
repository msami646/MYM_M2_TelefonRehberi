package ders1.alistirmalar

fun main() {
    /*
     Görev 3 – Dikdörtgen Alan Hesaplayıcı (Güvenli double): Kullanıcıdan dikdörtgenin iki kenar uzunluğunu konsoldan isteyin.
      Girdilerin sayısal olmama durumunu kontrol ederek yedek birer kenar değeri atayın.
       Kenarları alan ve alanı hesaplayıp geriye (Double) döndüren bir fonksiyon yazın. Sonucu ana programda yazdırın.
     */
    println("-----DİKDÖRTGEN ALAN HESAPLAYICI-----")

    print("Dikdötgenin ilk kenarını giriniz: ")
    val ilkKenar = readln().toDoubleOrNull() ?: 0.0

    print("Dikdörtgenin ikinci kenarını giriniz: ")
    val ikinciKenar = readln().toDoubleOrNull() ?: 0.0

    val alan = dikdortgenAlanHesaplama(ilkKenar,ikinciKenar)
    println("Dikdörtgen Alanı: $alan")

}
fun dikdortgenAlanHesaplama(ilkKenar : Double , ikinciKenar : Double) : Double{
    return ilkKenar * ikinciKenar
}