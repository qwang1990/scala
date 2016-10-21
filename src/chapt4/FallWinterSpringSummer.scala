import ChecksumAccumulator.calculate
/**
  * Created by wangqi on 16/10/15.
  */
object FallWinterSpringSummer extends App{
  for (season <- List("fall", "winter", "spring"))
    println(season + ": " + calculate(season))
}
