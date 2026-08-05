package ders2

fun main() {
    profilOLustur("Sami","Aydın", bultenAboneligi = false)
    profilOLustur(
        ad = "Sami",
        soyad = "Aydın",
        bultenAboneligi = true,
        yas = 14
    )
}
fun profilOLustur(ad: String,soyad: String, yas: Int = 18,bultenAboneligi : Boolean = false){
    println("Kullanıcı: $ad $soyad, Yaş: $yas, Bülten: $bultenAboneligi")
}