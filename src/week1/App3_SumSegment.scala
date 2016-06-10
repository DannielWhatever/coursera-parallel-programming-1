package week1

/**
  * Created by Daniel on 10-06-2016.
  */
object App3_SumSegment {

  def main(args: Array[String]): Unit = {

    println(sumSegment(Array(1,2,3,45),2,1,4))
    println(sumSegment(Array(1,2,3,45),2,1,3)+sumSegment(Array(1,2,3,45),2,3,4))
    val (a,b) = parallel(sumSegment(Array(1,2,3,45),2,1,3),sumSegment(Array(1,2,3,45),2,3,4))
    println(a+b)
    println(parallelSum(sumSegment(Array(1,2,3,45),2,1,3),sumSegment(Array(1,2,3,45),2,3,4)))

  }

  /**
    * sequential impl
    */
  def sumSegment(a:Array[Int],p:Double,s:Int,t:Int):Int = {
    var sum = 0
    for(i <- s until t){
      sum += math.exp(math.log(math.abs(a(i)))).toInt
    }
    sum
  }

  //u can thwo a recursive method to do parallel
  def parallel[A,B](taskA: => A, taskB: => B):(A, B)={
    (taskA,taskB)
  }

  def parallelSum(a: => Int,b: => Int):Int = a+b


}
