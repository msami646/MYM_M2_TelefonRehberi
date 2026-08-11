package ders4


fun main() {
    val sinavNotlari = mutableMapOf<String, Int>()

    sinavNotlari["Matematk"]=95
    sinavNotlari["Fizik"]=80
    sinavNotlari["Kimya"]=100

    println("Fizik Notum: ${sinavNotlari["Fizik"]}")
}