package ders1.alistirmalar

fun main() {
    /*
    🖥️ Görev 1 – Kişiselleştirilmiş Sistem Bilgisi (Parametreli):
    Kullanıcıdan konsol üzerinden ismini isteyin
    (boş bırakma ihtimaline karşı bir varsayılan isim atayın).
     Ardından bu ismi parametre olarak alan ve “Leader Bank” uygulamasının
    2026 yılı telif hakkı kartını o isme özel olarak konsola basan bir
    fonksiyon yazın.
     */

    print("Lütfen isminizi giriniz: ")
    val girilenIsim = readln()

    val isim = if (girilenIsim.isEmpty()) "Boş" else girilenIsim


    ismeOzelBasim(isim)
}
fun ismeOzelBasim (isim: String?){
    println("Merhaba $isim. Leader Bank uygulamasının 2026 yılı telif hakkı kartına sahipsiniz.")
}