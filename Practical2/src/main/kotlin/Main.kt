fun main() {
    val age1 : Int = 42
    val age2 : Int = 21
    val avg1 = (age1 + age2)/2
    println("$avg1 - среднее арифм.")

    val firstName = "Helga"
    val lastName = "Lanz"
    val fullName = firstName + " " + lastName
    println(fullName)
    val myDetails = "Hi,Danke! "

    println("${myDetails + fullName}")

    val bornDate = Triple(12,16,2002)
    var month = bornDate.first
    val day = bornDate.second
    val year = bornDate.third

    println(month)
    println(year)

    month = 10

    val newBornDate: Pair<Int,Int> = 10 to year
    println(newBornDate)
}