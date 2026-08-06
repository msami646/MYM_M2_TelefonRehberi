package ortak

/*
    Ardından sepetHesapla adında bir fonksiyon yazın. Bu fonksiyon ürün fiyatını,
    KDV oranını (varsayılan değeri 0.18) ve kargo ücretini (varsayılan değeri 29.90)
    parametre olarak alsın.
 */
fun sepetHesapla(urunfiyat: Double,kDVorani:  Double = 0.18,kargoUcreti: Double = 29.90): Double{
    return urunfiyat + kDVorani + kargoUcreti
}
fun daireAlanHesaplama(yaricap: Double): Double = 3.14 * (yaricap * yaricap)

fun sistemUyarisi(mesaj: String, hataDurumu: Boolean = false, hataKodu: Int = 404): String {
    return "Hatanın mesajı: $mesaj .Hata Durumu: $hataDurumu .Hata Kodu: $hataKodu"
}
fun kareHesapla(sayi: Double): Double = sayi * sayi

fun hipetonusKaresiHesaplama(a: Double,b: Double): Double{
    val akare =kareHesapla(a)
    val bkare = kareHesapla(b)
    return akare + bkare
}