package chapt6

/**
  * Created by wangqi on 16/10/17.
  */
class Rational(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g
  def this(n: Int) = this(n, 1)
  def + (that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
  def + (i: Int): Rational =
    new Rational(numer + i * denom, denom)
  def - (that: Rational): Rational =
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )
  def - (i: Int): Rational =
    new Rational(numer - i * denom, denom)
  def * (that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)
  def * (i: Int): Rational =
    new Rational(numer * i, denom)
  def / (that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)
  def / (i: Int): Rational =
    new Rational(numer, denom * i)
  override def toString = numer + "/" + denom
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}



object Rational {
  def main(args: Array[String]): Unit = {
    //这个叼,隐式转换
    implicit def intToRational(x: Int) = new Rational(x)
    val oneHalf = new Rational(1, 2)
    val oneHalf2 = new Rational(1,2)
    val twoThirds = new Rational(2, 3)
    println(oneHalf + oneHalf2 * twoThirds)

    println(2 * oneHalf)

    println(oneHalf.numer)
  }
}

