package ders2.alistirmalar

import ortak.sepetHesapla
import java.util.Locale
import java.util.Locale.getDefault

fun main() {
    /*
    Görev 2: Kuponlu Sipariş Çağrısı (Named Arguments)

Görev 1’de oluşturduğunuz sepetHesapla fonksiyonunu kullanacağız. K
ullanıcıdan ürün fiyatını ve “Ücretsiz Kargo” kuponu olup olmadığını (E/H şeklinde) konsoldan isteyin.
Eğer kullanıcının ücretsiz kargo kuponu varsa, fonksiyonu çağırırken kargo ücretini 0.0 olarak ezmek
istiyorsunuz. Ancak KDV oranına hiç dokunmayıp varsayılan değerinde (0.18) kalmasını sağlamalısınız.
Bunu aradaki parametreyi atlayacak şekilde isimlendirilmiş argüman (Named Argument) kullanarak
gerçekleştirin.
     */
    print("Ürün fiyatını giriniz: ")
    val fiyat = readln().toDoubleOrNull() ?: 0.0

    print("Ücretsiz kargo kuponunuz var mı?(E/H)")
    val kupon = readln().uppercase()
    var toplamFiyat : Double
    if (kupon == "E"){
        toplamFiyat = sepetHesapla(fiyat, kargoUcreti = 0.0)
    }else{
        toplamFiyat = sepetHesapla(fiyat)
    }
    println("Toplam Fiyat: $toplamFiyat")

}