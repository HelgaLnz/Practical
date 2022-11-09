package coordinates

abstract class Coordinate(){

    abstract var x: Double?
    abstract var y: Double?
    abstract var z: Double?

    private fun zIsNotNull(): String =
        if (z != null )
            ",${String.format("%.1f", z)}"
        else ""

    override fun toString(): String =
        "(${String.format("%.1f", x)}; ${String.format("%.1f", y)}${zIsNotNull()})"
}