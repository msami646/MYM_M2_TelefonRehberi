package ders2

fun main() {
    urunKaydet(fiyat = 150.0, id = 11, isim = "Defter")
}
fun urunKaydet(id:Int,kategori: String = "Genel", isim: String,fiyat: Double) {
    println("ÜRÜN BİLGİSİ \nID: $id \nKategori: $kategori\nİsim: $isim\nFiyat: $fiyat")
}