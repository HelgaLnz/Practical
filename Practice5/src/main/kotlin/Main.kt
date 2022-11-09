import lines.ColoredLine
import points.ColoredPoint
import points.Point
import polygons.Polygone
import java.awt.Color

fun main() {
    val point = Point(2.3,3.0)
    val polygone = Polygone(
        arrayOf(
            ColoredLine(ColoredPoint(Color.BLUE,1.4,1.2), ColoredPoint(Color.BLUE,1.2,1.4), Color.DARK_GRAY),
            ColoredLine(ColoredPoint( Color.BLUE,-1.4,-1.2,), ColoredPoint(Color.BLUE,-2.2,-1.4), Color.DARK_GRAY),
            ColoredLine(ColoredPoint(Color.BLUE,4.4,6.2), ColoredPoint(Color.BLUE,8.2,8.4), Color.DARK_GRAY),
            ColoredLine(ColoredPoint(Color.BLUE,1.4,1.2), ColoredPoint(Color.BLUE,2.2,1.4), Color.DARK_GRAY))
        ,Color.DARK_GRAY)
    polygone.shiftOX(10.0)
    polygone.shiftOY(-10.0)
    println()
    polygone.printPolygone()
}



