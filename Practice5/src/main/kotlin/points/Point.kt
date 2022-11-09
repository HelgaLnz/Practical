package points

import coordinates.Coordinate
import java.awt.Color

open class Point(private var _coordinatesX:Double, private var _coordinatesY:Double, private var _coordinatesZ:Double? = null):
    Coordinate() {
    override var x: Double?
        get() = _coordinatesX
        set(value) {
            if(value!= null)
            _coordinatesX = value
        }

    override var y: Double?
        get() = _coordinatesY
        set(value) {
            if(value != null)
                _coordinatesY = value
        }

    override var z: Double?
        get() = _coordinatesZ
        set(value) {
            if(value != null)
                _coordinatesZ = value
        }

    constructor(): this(0.0,0.0,0.0)

    override fun toString(): String =
        "Point: ${super.toString()}"
}

class ColoredPoint(private var _colorPoint: Color,coordinateX: Double,coordinateY: Double,coordinateZ: Double? = null)
    : Point(coordinateX,coordinateY,coordinateZ){
    override var x: Double?
        get() = super.x
        set(value) {super.x = value}

    override var y: Double?
        get() = super.y
        set(value) {super.y = value}

    override var z: Double?
        get() = super.z
        set(value) {super.z = value}

    var colorPoint
        get() = _colorPoint
        set(value) { _colorPoint = value}

    constructor() : this(Color.BLACK,0.0,0.0,0.0)


   override fun toString(): String =
       "${super.toString()} Color: $colorPoint"

    fun thirdIsNotNull() : Boolean =
        this.z != null

}
