import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.roundToLong
import kotlin.math.sqrt

fun main() {
    val exercises: Byte = 13
    val exercisesSolved: Byte = 0
    var expercisesIsVar = 13
    expercisesIsVar += 1
    var ageOfUser: Int = 20
    var ageOfUserDouble: Double = 20.0
    ageOfUserDouble = (20 + 30) / 2.0
    var testNumber: Int = 24
    var evenOdd: Int = testNumber % 2
    var answer = 0
    answer += 1
    answer += 10
    answer *= 10
    answer shr 3
    println(evenOdd)
    println(answer)
    val a = 46
    val b = 100
    val answer1: Int = (a * 100) + b
    val answer2: Int = (a * 100) + (b * 100)
    val answer3: Int = (a * 100) + (b / 100)
    println("$answer1 $answer2 $answer3")

// Task9
    val averageValueAAndValueB: Double = (a.toDouble() + b.toDouble()) / 2
    println(averageValueAAndValueB)

//Task10
    val fahrenheit: Double = 57.2
    var celcius: Double = (fahrenheit - 32) / 1.8
    println(celcius)
//Task11
    var positionSearch: Int = 63
    var position: Int = 0
    columnLoop@ for (column in 0..7) {
        for (row in 0..7) {
            if (positionSearch == position) {
                print("$row $column")
                break@columnLoop
            }
            position += 1
        }

    }
    println()

//Task12
    val degrees: Double = 240.0
    var radians = (degrees * PI) / 180
    println("Угол $degrees в радианах ${String.format("%.3f", radians)}")


//Task13

    val x1: Double = 3.0
    val x2: Double = -5.1
    val y1: Double = 3.5
    val y2: Double = -5.2
    var distance: Double = sqrt(((x2 - x1).pow(2.0)) + ((y2 - y1).pow(2.0)))
    println("Расстояние между ($x1;$y1) и ($x2;y2) равняется ${ String.format("%.3f", distance)}")
}