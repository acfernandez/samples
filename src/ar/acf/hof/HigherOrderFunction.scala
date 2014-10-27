package ar.acf.hof

object HigherOrderFunction {
  
  def main(args: Array[String]): Unit = {
    
    val books: Seq[Book] = Seq(
        new Book("Sandra Blow", Seq("Bird, Michael")),
        new Book("Romeo & Julie", Seq("Shakespeare"))
    )
    
    //Resolution 1
    println(for (b <- books; a <- b.authors if a startsWith "Bird") yield b.title)
    
    //Resolution 2 - with using higher order function
    println(books flatMap(f => f.authors withFilter(a => a startsWith "Bird")  map (y => f.title)))
  
  }
  
  case class Book(title: String, authors: Seq[String])

}