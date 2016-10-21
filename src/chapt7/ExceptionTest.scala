package chapt7

/**
  * Created by wangqi on 16/10/20.
  */
object ExceptionTest extends App{

  val n = 5
  try {
    val half =
      if (n % 2 == 0)
        n/2 else
        throw new RuntimeException("n must be even")
  } catch {
    case ex:RuntimeException => println(ex)
  }

}
