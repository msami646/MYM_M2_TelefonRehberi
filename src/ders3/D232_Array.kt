package ders3

fun main() {
    val gunler = arrayOf("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar")

    println(gunler[2])
    println(gunler[2].uppercase())
    val carsamba = gunler[2]

    gunler[6] = "PAZAR"
    println(gunler[6])

   // println(gunler[7]) //HATA: Sınır Dışı
    //İÇİ BOŞ ARRAY
    val isimler = arrayOfNulls<String>(3)
    isimler[0] = "Ali"

    println(isimler.contentToString())

    val sayilar = IntArray(size = 3)
    println(sayilar.contentToString())

    val ondalikliSayilar = DoubleArray(3)
    println(ondalikliSayilar.contentToString())

    println(gunler.joinToString("|"))

    //Array'lerde döngü kullanımı
    for(gun in gunler){
        println(gun.uppercase())
    }
}