package chapt7

/**
  * Created by wangqi on 16/10/19.
  */
object ControlExpress extends App{
  val filename =
    if (!args.isEmpty) args(0)
    else "default.txt";
  println(filename)

//  val filesHere = (new java.io.File(".")).listFiles
//  for (file <- filesHere)
//    println(file)

  val filesHere = (new java.io.File(".")).listFiles
//  for (file <- filesHere if file.getName.endsWith(".scala"))
//    println(file)

//  grep(".*gcd.*")
//
//  def grep(pattern: String) =
//    for {
//      file <- filesHere
//      if file.getName.endsWith(".scala")
//      line <- fileLines(file)
//      trimmed = line.trim
//      if trimmed.matches(pattern)
//    } println(file + ": " + trimmed)
//
//
//  def fileLines(file: java.io.File) =
//    scala.io.Source.fromFile(file).getLines().toList

  def scalaFiles =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
    } yield file

  println(scalaFiles.toList.toString())
}
