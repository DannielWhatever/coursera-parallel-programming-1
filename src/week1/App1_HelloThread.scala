package week1

/**
  * Created by Daniel on 10-06-2016.
  */
object App1_HelloThread {

  def main(args: Array[String]): Unit = {

    println("hi im "+Thread.currentThread().getId)
    val t = new HelloThread
    t.start()
    println("hi im "+Thread.currentThread().getId)
    t.join()
    println("hi im "+Thread.currentThread().getId)
  }

}

class HelloThread extends Thread {
  override def run(): Unit = println("hi im "+Thread.currentThread().getId)
}

