package ders4

fun main() {
    /*
    Map mimarisini kullanarak bir marketin kasa sisteminin temelini kodlayın:

    Anahtarı ürün ismi (String), değeri ise ürün fiyatı (Double) olan urunFiyatlari adında boş bir mutableMapOf oluşturun.
    Bu Map yapısına “Ekmek” için 10.0, “Süt” için 25.5, “Yumurta” için 45.0 değerlerini ekleyin.
    Market yöneticisi sütün fiyatına zam yaptı. “Süt” anahtarının değerini 29.5 olarak güncelleyin (üzerine yazın).
    Son olarak sistemden sütün güncel fiyatını anahtarı ile çekerek ekrana yazdırın.

     */
    val urunFiyatlari = mutableMapOf<String, Double>()
    urunFiyatlari["Ekmek"]=10.0
    urunFiyatlari["Süt"]=25.5
    urunFiyatlari["Yumurta"]=45.0

    println(urunFiyatlari)

    urunFiyatlari["Süt"]=29.5

    println(urunFiyatlari)

}