package ders3.alistirmalar

fun main() {
    val katilimciListesi = mutableListOf<String>()
    for (i in 1..4){
        print("$i. katılımcıyı giriniz: ")
        val katilimci = readln().trim()
        katilimciListesi.add(katilimci)
    }
    if (katilimciListesi.isNotEmpty()){
        katilimciListesi.shuffle()
        val sansliKisi = katilimciListesi.random()

        println("Tebrikler $sansliKisi adlı kişi kazandı.")
    }else{
        println("Liste Boş")
    }



}