package ders1

fun main() {
    print("Bir kilometre (km) değeri girin: ")
    val km = readln().toDouble()



    val mil = kmToMil(km)
    println("$km km = $mil mil eder.")

}

fun kmToMil(km: Double) : Double{
    return km *0.62
}
