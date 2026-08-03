package ders1

fun main() {
    /*
    Parametreli Görev: urunFiyatiGoster adında bir fonksiyon oluşturun.
     Dışarıdan urunAdi (String) ve fiyat (Double) olmak üzere iki adet parametre alsın.
      Ekrana “Seçtiğiniz ürün: [urunAdi], Fiyat: [fiyat] TL” yazdırsın. main bloğu içerisinden bu fonksiyonu 3 farklı ürün
      ve fiyat bilgisi göndererek test edin.
     */
    urunFiyatGoster("Şeker" ,50.0)
    urunFiyatGoster("Süt",30.5)
    urunFiyatGoster("Kurabiye",25.7)

}
fun urunFiyatGoster(urunAdi : String ,fiyat : Double){
    println("Seçtiğiniz ürün: $urunAdi, Fiyat: $fiyat TL")

}