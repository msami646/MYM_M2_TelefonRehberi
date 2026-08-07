package ders3

fun main() {
    val alisVerisSepeti = mutableListOf<String>()

    alisVerisSepeti.add("Kalem")
    alisVerisSepeti.add("Defter")
    alisVerisSepeti.add("Silgi")

    println("Alışveriş Sepeti: $alisVerisSepeti")

    alisVerisSepeti.add("Çanta")
    println("Alışver,s Sepeti: $alisVerisSepeti")

    alisVerisSepeti.remove("Defter")
    println("Alışveriş Sepeti: $alisVerisSepeti")

    alisVerisSepeti.removeAt(2)
    println("Alışveriş Sepeti: $alisVerisSepeti")

    println(alisVerisSepeti.remove("Mouse"))
    println("Alışveriş Sepeti: $alisVerisSepeti")
}

