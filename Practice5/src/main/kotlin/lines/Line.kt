package lines

import points.ColoredPoint
import points.Point
import java.awt.Color

open class Line(private var _pointOne: ColoredPoint, private var _pointTwo: ColoredPoint) {
    var pointOne
        get() = _pointOne
        set(value) { _pointOne = value }
    var pointTwo
        get() = _pointTwo
        set(value)  { _pointTwo = value }

    constructor() : this(ColoredPoint(),ColoredPoint())

    override fun toString(): String =
        "\nOne  ${pointOne.toString()}" +
                "\nTwo ${pointTwo.toString()}"
}

open class ColoredLine(pointOne: ColoredPoint, pointTwo: ColoredPoint, private var _colorLine: Color) : Line(pointOne, pointTwo) {
    var colorLine
        get() = _colorLine
        set(value) { _colorLine = value }

    constructor() : this (ColoredPoint(), ColoredPoint(), Color.BLACK)

    override fun toString(): String =
        "\nLine : ${super.toString()} \n" + "Line Color : ${colorLine.toString()}\n"

}