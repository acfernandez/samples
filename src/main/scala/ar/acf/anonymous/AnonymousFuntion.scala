package ar.acf.anonymous

object AnonymousFuntion {

  def oneTimeForSecond(repit: () => Unit) {
    while(true) {repit(); Thread sleep 1000 }
  }
  
  def main(args: Array[String]) {
    oneTimeForSecond(() => println("Time flies.."))
  }
  
}