package funsets
import math.abs
object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
  def s: Set = (x: Int) => x % 500 == 0
  def p: Int => Boolean = (x:Int) => x % 5 == 0
  println(forall(s,p))
  println(exists(s,p))
  println(printSet(s))

  println(printSet(map(s,x => x*2 )))
}
