/**
  * Created by wangqi on 16/10/15.
  */
import ChecksumAccumulator.calculate

object Summers {
  def main(args: Array[String]) = {
    for (arg <- args)
      println(arg + " haha : " + calculate(arg))
  }
}

