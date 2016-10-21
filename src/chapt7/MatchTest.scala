package chapt7

/**
  * Created by wangqi on 16/10/20.
  */
object MatchTest extends App{

  val firstArg = if (args.length > 0) args(0) else ""
  firstArg match {
    case "salt" => println("pepper")
    case "chips" => println("salsa")
    case "eggs" => println("bacon")
    case _ => println("huh?")
  }

  //其实match操作返回值....
  val firstArg2 = if (!args.isEmpty) args(0) else ""
  val friend =
    firstArg2 match {
      case "salt" => "pepper"
      case "chips" => "salsa"
      case "eggs" => "bacon"
      case _ => "huh?"
    }
  println(friend)

}
