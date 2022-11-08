fun main() {
    printFullName(firstName = "Helga", lastName = "Lanz")
    val myFullName = calculateFullName("Helga","Lanz")
    searchSimpleNumber()
    println(fibonacci(4))
}

fun printFullName(firstName: String, lastName :String) {
    println("$firstName $lastName")

}

fun calculateFullName(firstName: String, lastName: String): Pair<String,UInt>{
    val fullName = "$firstName $lastName"
    return Pair(fullName, fullName.length.toUInt())
}

fun searchSimpleNumber(range: IntRange = 0..10) {
    for(number in range){
        if((number % 2 != 0) && (number % 3 != 0) && (number != 0))
            println(number)
    }
}
fun fibonacci(number: Int ): Int{
    if(number in 1..2)
        return 1
    return fibonacci(number - 1) + fibonacci(number - 2 )


}