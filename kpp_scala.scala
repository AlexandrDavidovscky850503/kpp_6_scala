object kpp_scala extends App {
//	Найти сумму всех положительных чисел в коллекции.
val array =List(12,2,-90,-8,99,4,12)

  def sumOfPositiveElements(array:List[Int]):Int ={
    val totalPositiveElements = array.filter(_ > 0)

     /* def getTotal(list: List[Int]) = {
        def get(list: List[Int], total: Int): Int = list match {
          case head :: tail => get(tail, total + head)
          case Nil => total
      }
      get(list, 0)
    }

    getTotal(totalPositiveElements)
    */
      totalPositiveElements.sum
  }
  println(sumOfPositiveElements(array))

  //Реализовать функцию, которая возвращает предпоследний элемент списка

  def getPenultimateNumber(numbers:List[Int]):Int ={
    numbers.fold(0) { (m: Int, n: Int) =>
    {
      if (m == numbers.size - 2) n
      else m + 1
    }
    }-1
  }
  println( getPenultimateNumber( array))
    //Преобразовать Map таким образом, чтобы ключи оригинального Map стали значениями преобразованного, и наоборот.

  val myMap = Map(1 -> 2, 3 -> 4, 5 -> 6)
  println(myMap)

  def reversKeyValue(myMap:Map[Int,Int]):Map[Int,Int]={
    myMap.map(x=>x.swap)
  }
  val res=reversKeyValue(myMap)
  println(res)
}
