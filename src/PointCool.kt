import biuoop.DrawSurface

class PointCool(x: Double, y: Double) : Point(x, y) {
    fun draw(d: DrawSurface) {
        drawOn(d)
        val p2 = Point(x+50, y+50)
        p2.drawOn(d)
    }
}