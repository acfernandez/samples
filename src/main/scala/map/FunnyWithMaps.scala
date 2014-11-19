package map


object FunnyWithMaps {
  
  val cityOfCountry = Map("AR" -> "Buenos Aires", "US" -> "Whashinton", "BR" -> "Brazilia")
  
  def showCapital(country: String) = cityOfCountry.get(country) match {
    case Some(capital) => capital
    case None => "missing data"
  }
  
  val names = List("Alberto", "Andrea", "Adrian", "Malena", "Mia")
  
  def main(args: Array[String]): Unit = {
    //first sample
    println(showCapital("AR"))
    println(showCapital("CO"))
    
    //another way of the first sample
    val wrapper = cityOfCountry withDefaultValue("missing data")
    println(wrapper("CO"))
    
    //second sample
    println(names groupBy(_.head))
  }

}