import java.util.*
import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.math.sqrt

fun main() {
    val myAge = 20
    val isTeenager = (myAge in 13..19)
    val theirAge = 30
    val bothTeenager = isTeenager && theirAge in 13..19

    println(bothTeenager)

    val reader = "Helga"
    val author = "Richard Lucas"
    val authorIsReader = reader == author

    println(authorIsReader)

    val readerBeforeAfter = reader < author
    println(readerBeforeAfter)

    val myAge2 = 20
    if (myAge2 in 13..19)
        println("You is teenager")
    else
        println("You isn`t teenager")

    val answer = if (myAge2 in 13..19) true else false

    println(answer)

    var counter = 0
    while (counter < 10) {
        print(counter)
        counter++
    }

    println()

    counter = 0
    var roll = 0
    do {
        roll = Random().nextInt(6)
        counter++
        println("$roll $counter")
    } while (roll != 0)

    println()

    val range: IntRange = 1..10

    for (j in range)
        print("${j.toDouble().pow(2.0).roundToInt()} ")

    println()

    for (j in range)
        print("${String.format("%.3f", sqrt(j.toDouble()))} ")

    println()
    println()

    var sum = 0
    val range1 = 1 until 8
    for (row in range1 step 2)
        for (column in range1)
            sum += row * column
            println(sum)
}