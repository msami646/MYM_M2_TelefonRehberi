package ortak

import ders1.cizgiCek

/*
    Ardından sepetHesapla adında bir fonksiyon yazın. Bu fonksiyon ürün fiyatını,
    KDV oranını (varsayılan değeri 0.18) ve kargo ücretini (varsayılan değeri 29.90)
    parametre olarak alsın.
 */
fun sepetHesapla(urunfiyat: Double, kDVorani: Double = 0.18, kargoUcreti: Double = 29.90): Double {
    return urunfiyat + kDVorani + kargoUcreti
}

fun daireAlanHesaplama(yaricap: Double): Double = 3.14 * (yaricap * yaricap)

fun sistemUyarisi(mesaj: String, hataDurumu: Boolean = false, hataKodu: Int = 404): String {
    return "Hatanın mesajı: $mesaj .Hata Durumu: $hataDurumu .Hata Kodu: $hataKodu"
}

fun kareHesapla(sayi: Double): Double = sayi * sayi

fun hipetonusKaresiHesaplama(a: Double, b: Double): Double {
    val akare = kareHesapla(a)
    val bkare = kareHesapla(b)
    return akare + bkare
}

fun sepetUrunEkle(marketSepeti: MutableList<String>) {
    for (i in 1..3) {
        print("$i. ürünü giriniz: ")
        val urun = readln().trim()
        if (urun.isNotEmpty()) {
            marketSepeti.add(urun)
        }

    }
}

fun urunSorgula(marketSepeti: MutableList<String>) {
    print("Aramak istediğiniz ürünün adını girin: ")
    val arananUrun = readln().trim().lowercase()
    if (marketSepeti.contains(arananUrun)) {
        val arananUrununSirasi = marketSepeti.indexOf(arananUrun)
        println("Mevcut ürünün indexi: $arananUrununSirasi")
    } else {
        println("Ürün sepetinizde bulınamadı! $arananUrun, listenin başına ekleniyor...")
        marketSepeti.add(0, arananUrun)
        println("Aranan ürün eklendi. ")
    }
}

fun plakaDogrula(gecerliPlakalar: List<Int>) {
    print("Aramak istediğiniz plaka kodunu giriniz: ")
    val plaka = readln().toIntOrNull()

    if (plaka == null) {
        println("Geçerli bir sayısal plaka kodu girin")
    } else {
        if (gecerliPlakalar.contains(plaka)) {
            println("Sisteminiz bu şehri desteklemektedir")
        } else {
            println("Desteklenmeyen plaka kodu")
        }
    }
}

/**Ders4-Alıştırma Fonksiyonları*/
//Alıştırma 1 Fonksiyonları
fun davetliEkle(davetliler: MutableSet<String>) {
    for (i in 1..5) {
        print("$i. davetlinin adını giriniz: ")
        val isim = readln()

        if (isim.isNotEmpty()) {
            davetliler.add(isim)
        }
    }
}

fun kisiKayitliMi(davetliler: Set<String>, arananIsim: String) = davetliler.contains(arananIsim)

fun rastgeleTahliSec(davetliler: Set<String>): String {
    val davetliListesi = davetliler.toList()
    return davetliListesi.random()
}

fun cekilisRaporuOlustur(davetliler: Set<String>) {
    println("**ÇEKİLİŞ RAPORU**")

    println("Toplam Kayıtlı Davetli Sayısı: ${davetliler.size}")

    println("Kurada olup olmadığını kontrol etmmek istediğiniz ismi giriniz:")
    val aranan = readln().trim()

    val kayitVarmi = kisiKayitliMi(davetliler, aranan)

    if (kayitVarmi) {
        println("Evet $aranan listede var")
    } else {
        println("Hayır $aranan listede yok")
    }
    if (davetliler.isNotEmpty()) {
        val talihli = rastgeleTahliSec(davetliler)
        println("Şanslı Talihli: $talihli")
    } else {
        println("Çekiliş yapılacak davetli bulunamadı.")
    }


}

//Alıştırma 2 Fonksiyonları
fun sozlukUygulamasi(sozluk: MutableMap<String, String>) {
    println("İngilizce bir kelime giriniz: ")
    val kelime = readln().trim().lowercase()
    if (kelime.isEmpty()) {
        println("Boş kelime aratılmaz")
    } else if (sozluk.containsKey(kelime)) {
        println("Türkçe karşılığı: ${sozluk[kelime]}")
    } else {

        println("Bu kelime sözlükte yok!")
        println("Lütfen $kelime kelimesinin türkçe anlamını girin: ")
        val anlam = readln().trim().lowercase()
        if (anlam.isNotEmpty()) {
            sozluk[kelime] = anlam
            println("Yeni kelime sözlüğe eklendi \n güncel sözlük $sozluk")
        }
    }

}

//Alıştırma 3 Fonksiyonlar
fun urunIsimleriYazdir(urunler: Map<String, Double>) {
    println("--Dükkandaki ürünler: ${urunler.keys}")
}

fun toplamKasaDegeriniHesapla(urunler: Map<String, Double>): Double {
    var toplamFiyat = 0.0
    for (fiyat in urunler.values) {
        toplamFiyat += fiyat
    }
    return toplamFiyat
}


fun detaylilisteYazdir(urunler: Map<String, Double>){
    for((urun,fiyat)in urunler){
        println("ürün adı: $urun, ürün fiyat: $fiyat TL")
    }
}
fun envanterRaporu(urunler: Map<String, Double>){
    cizgiCek()
    println("***Envanter ve Kasa Raporu***")
    cizgiCek()

    urunIsimleriYazdir(urunler)

    val kasaDegeri = toplamKasaDegeriniHesapla(urunler)
    println("Toplam kasa ddeğeri: $kasaDegeri")
    detaylilisteYazdir(urunler)
}
