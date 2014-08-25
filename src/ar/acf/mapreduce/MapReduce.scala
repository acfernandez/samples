package ar.acf.mapreduce

import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.Map

object MapReduce {

  def main(args: Array[String]): Unit = {
    
    val text = "you and you and only you are the max"
    
    val mapper = text.split(" ")
    println("Mapper contains: " + mapper.mkString(","))
    
    val reducer: Map[String, ArrayBuffer[Int]] = Map()
    
    mapper.foreach(m => reducer getOrElseUpdate(m, ArrayBuffer()) += 1)
    
    println("Reducers contains: " + reducer.mkString(","))
    
    // count occurrencies
    reducer.foreach(f => println(f._1 + ":" +  f._2.sum))
  }

}