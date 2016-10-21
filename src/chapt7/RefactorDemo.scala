package chapt7

/**
  * Created by wangqi on 16/10/20.
  */
object RefactorDemo extends App{

  //用java风格打印乘法口诀
  def printMultiTable() = {
    var i = 1
    // only i in scope here
    while (i <= 10) {
      var j = 1
      // both i and j in scope here
      while (j <= 10) {
        val prod = (i * j).toString
        // i, j, and prod in scope here
        var k = prod.length
        // i, j, prod, and k in scope here
        while (k < 4) {
          print(" ")
          k += 1 }
        print(prod)
        j += 1 }
      // i and j still in scope; prod and k out of scope
      println()
      i += 1 }
    // i still in scope; j, prod, and k out of scope
  }

  printMultiTable()


  // Returns a row as a sequence
  def makeRowSeq(row: Int) =
    for (col <- 1 to 10) yield {
      val prod = (row * col).toString
      val padding = " " * (4 - prod.length)
      padding + prod
    }
  // Returns a row as a string
  def makeRow(row: Int) = makeRowSeq(row).mkString
  // Returns table as a string with one row per line
  def multiTable() = {
    val tableSeq = // a sequence of row strings
      for (row <- 1 to 10)
        yield makeRow(row)
    tableSeq.mkString("\n")
  }

  println(multiTable())


}
