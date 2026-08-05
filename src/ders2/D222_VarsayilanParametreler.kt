package ders2

import ders1.cizgiCek

fun main() {
    kahveSiparisiAl("Filtre Kahve")
    cizgiCek()
    kahveSiparisiAl("Türk Kahvesi","Şekersiz")
    cizgiCek()
    kahveSiparisiAl("Latte", sutlu = true)
}
fun kahveSiparisiAl(kahveTuru: String,sekerMiktari : String = "Orta",sutlu: Boolean = false){
    println("Sipariş: $kahveTuru, Şeker Miktarı: $sekerMiktari, Sütlü mü: $sutlu")

}