package fix

import scala.math.Pi

object Scalafixrule4 {

  val a : Int = (2+2)

  def square : Double => Double => x => x * x

  val surface : Double => Double = radius => (2+2) * Pi * square(radius)

  val volume : Double => Double = radius => (2+2)* Pi * cube(radius) / 3

  val name4 = "hello 4"

}
