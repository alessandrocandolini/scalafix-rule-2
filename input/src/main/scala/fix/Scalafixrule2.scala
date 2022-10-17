/*
rule = Scalafixrule2
*/
package fix

import scala.math.Pi

object Scalafixrule4 {

  val a : Int = 4

  def square : Double => Double = x => x * x

  def cube : Double => Double = x => x * x * x

  val surface : Double => Double = radius => 4 * Pi * square(radius)

  val volume : Double => Double = radius => 4 * Pi * cube(radius) / 3

  val name4 = "hello 4"

}
