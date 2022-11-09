package polygons

import lines.ColoredLine
import java.awt.Color

class Polygone (private var _linesArray : Array<ColoredLine>, private var _coloredPolygone : Color){
    var linesArray
        get()= _linesArray
        set(value) {
            if( _linesArray.size in 1..3)
                _linesArray = value
        }
    var coloredPolygone
        get() =  _coloredPolygone
        set(value) { _coloredPolygone = value }

    constructor() : this(arrayOf(ColoredLine(), ColoredLine(), ColoredLine(), ColoredLine()), Color.BLACK)

    fun shiftOX (valueShift : Double) {
        for (valueLine in linesArray){
            valueLine.pointOne.x!! + valueShift
            valueLine.pointTwo.x!! + valueShift
        }
    }

    fun shiftOY(valueShift : Double){
        for ( valueLine in linesArray){
            valueLine.pointOne.y = valueLine.pointOne.y!! +  valueShift
            valueLine.pointTwo.y = valueLine.pointTwo.y!! + valueShift
        }
    }

    fun shiftOZ(valueShift : Double){
        for ( valueLine in linesArray){
                valueLine.pointOne.z!! + valueShift
                valueLine.pointTwo.z!! + valueShift
        }
    }

    override fun toString(): String =
        "Polygone: ${linesArray.contentToString()}" +
                "Color Polygone: ${coloredPolygone.toString()}"

    fun printPolygone() = println(this.toString())
}