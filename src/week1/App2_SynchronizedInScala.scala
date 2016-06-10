package week1

/**
  * Created by Daniel on 10-06-2016.
  */
object App2_SynchronizedInScala{

  def main(args: Array[String]): Unit = {

    runThread
    runThread
  }

  def runThread = {
    new Thread{
      override def run(): Unit = {
        val v = for(i <- 0 until 10) yield Uid.getUid
        println(v)
      }
    }.start()
  }

}


object Uid{
  private val x = new AnyRef {}
  private var uid = 0L
  def getUid: Long = x.synchronized{
    uid = uid + 1
    uid
  }
}