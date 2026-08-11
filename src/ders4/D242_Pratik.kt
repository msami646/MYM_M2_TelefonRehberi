package ders4

fun main() {
    /*
    Set yapısının eşsizlik özelliğini ve toList() dönüşümünü test etmek için şu problemi çözün:

    Bir web sitesinin o günkü ziyaretçilerinin IP adreslerini tutacak ziyaretciIPleri adında boş bir mutableSetOf<String> oluşturun.
    Bu kümeye .add() metodu ile “192.168.1.1”, “10.0.0.5” ve tekrar “192.168.1.1” değerlerini ekleyin.
    Kümenin son halini ve .size kullanarak kümedeki toplam eleman sayısını ekrana yazdırarak eşsizliği doğrulayın.
    İndeksle Veri Çekme: Şimdi sisteme ilk giriş yapan IP adresini (kümenin ilk elemanını) ekrana yazdırmak istiyorsunuz.
    Kümeyi bir listeye dönüştürün ve 0. indeksteki ilk IP adresini ekrana yazdırın.

     */
    val ziyaretciIpleri = mutableSetOf<String>()
    ziyaretciIpleri.add("192.168.1.1")
    ziyaretciIpleri.add("10.0.0.5")
    ziyaretciIpleri.add("192.168.1.1")

    println(ziyaretciIpleri)
    println("IP sayısı: ${ziyaretciIpleri.size}")

    val ziyaretciIPleriListe = ziyaretciIpleri.toList()
    println("İlk IP adresi: ${ziyaretciIPleriListe[0]}")

}