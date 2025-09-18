import biuoop.DrawSurface
import biuoop.GUI
import java.awt.Color

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() {
        val gui : GUI = GUI("My App", 800, 600)
        val d : DrawSurface = gui.getDrawSurface()
        val p :Point = Point(50.0,50.0)
        val p2 : PointCool = PointCool(500.0,500.0)
    p.drawOn(d)
    d.setColor(Color.RED)
    p2.draw(d)
    gui.show(d)
    }