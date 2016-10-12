/**
  * Created by wangqi on 16/10/9.
  */
val greetStrings = new Array[String](3)
greetStrings(0) = "heh"
//greetStrings.update(0, "Hello")
greetStrings.update(1, ", ")
greetStrings.update(2, "world!\n")
for (i <- 0.to(2))
  print(greetStrings.apply(i))

