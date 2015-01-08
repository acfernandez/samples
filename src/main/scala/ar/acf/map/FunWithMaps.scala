package ar.acf.map


object FunWithMaps {
  
  val cityOfCountry = Map("AR" -> "Buenos Aires", "US" -> "Whashinton", "BR" -> "Brazilia")
  
  val names = List("Alberto", "Andrea", "Adrian", "Malena", "Mia")
  
  val numOfChar = Map('a' -> '1', 'l' -> '2', 'b' -> '3', 'e' -> '4', 'r' -> '5', 't' -> '5', 'o' -> '6')
  
  
  def showCapital(country: String) = cityOfCountry.get(country) match {
    case Some(capital) => capital
    case None => "missing data"
  }
  
  def main(args: Array[String]): Unit = {
    //first sample
    println(showCapital("AR"))
    println(showCapital("CO"))
    
    //another way of the first sample
    val wrapper = cityOfCountry withDefaultValue("missing data")
    println(wrapper("CO"))
    
    //second sample
    println(names groupBy(_.head))
    
    //third sample
    println("Alberto".toLowerCase() map numOfChar)
  }

}