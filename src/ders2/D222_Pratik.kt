package ders2

import ders1.cizgiCek

fun main() {
    /*
    arsayılan parametrelerin gücünü test etmek için IDE’nizde şu problemi çözün:

    uygulamayaGiris adında bir fonksiyon oluşturun.
    Bu fonksiyon kullaniciAdi (String) ve cihazTipi (String) olmak üzere iki parametre alsın.
    cihazTipi parametresine “Mobil” şeklinde bir varsayılan (default) değer atayın.
    Fonksiyon içinde “Hoş geldin [kullaniciAdi]! ([cihazTipi] üzerinden bağlandın)” metnini yazdırın.
    main bloğu içinde fonksiyonu önce sadece isminizle çağırın. Ardından hem isminizi
    hem de “Web” cihaz tipini göndererek iki farklı çıktıyı gözlemleyin.


     */
    uygulamayaGiris("Sami")
    cizgiCek()
    uygulamayaGiris("Sami,PC")

}
fun uygulamayaGiris(kullanciAdi : String, cihazTipi : String= "Mobil"){
    println("Hoş geldin $kullanciAdi . $cihazTipi üzerinden bağlandım")
}