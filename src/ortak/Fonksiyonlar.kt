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

fun sepetUrunEkle(marketSepeti :MutableList<String>){
    for (i in 1..3){
        print("$i. ürünü giriniz: ")
        val urun = readln().trim()
        if(urun.isNotEmpty()){
            marketSepeti.add(urun)
        }

    }
}

fun urunSorgula(marketSepeti: MutableList<String>){
    print("Aramak istediğiniz ürünün adını girin: ")
    val arananUrun = readln().trim().lowercase()
    if (marketSepeti.contains(arananUrun)){
        val arananUrununSirasi = marketSepeti.indexOf(arananUrun)
        println("Mevcut ürünün indexi: $arananUrununSirasi")
    }else{
        println("Ürün sepetinizde bulınamadı! $arananUrun, listenin başına ekleniyor...")
        marketSepeti.add(0,arananUrun)
        println("Aranan ürün eklendi. ")
    }
}

fun plakaDogrula(gecerliPlakalar: List<Int>){
    print("Aramak istediğiniz plaka kodunu giriniz: ")
    val plaka = readln().toIntOrNull()

    if (plaka == null){
        println("Geçerli bir sayısal plaka kodu girin")
    }else{
        if (gecerliPlakalar.contains(plaka)){
            println("Sisteminiz bu şehri desteklemektedir")
        }else{
            println("Desteklenmeyen plaka kodu")
        }
    }
}