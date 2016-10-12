/**
  * Created by wangqi on 16/10/10.
  */

var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"
println(jetSet.contains("Lear"))


import scala.collection.immutable.HashSet
val hashSet = HashSet("Tomatoes", "Chilies")
println(hashSet + "Coriander")

import scala.collection.mutable
val treasureMap = mutable.Map[Int, String]()
treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find big X on ground.")
treasureMap += (3 -> "Dig.")
println(treasureMap(2))