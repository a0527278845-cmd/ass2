import biuoop.DrawSurface

open class Point(val x: Double, val y: Double) {
    override fun toString(): String {
        return "($x, $y)"
    }
    fun drawOn(d: DrawSurface) {
        d.fillCircle(x.toInt(),y.toInt(),5)
    }
}