import org.scalatest.FunSuite

class kpp_scalaTest extends FunSuite {

  test("testReversKeyValue") {
    val testMap = Map(1 -> 2, 3 -> 4, 5 -> 6)
    assert(kpp_scala.reversKeyValue(testMap)=== Map(2 -> 1, 4 -> 3, 6 -> 5))
  }

  test("testSumOfPositiveElements") {
    val testArray =List(1,-1,2,4,-8,3)
    assert(kpp_scala.sumOfPositiveElements(testArray)=== 10)
  }

  test("testGetPenultimateNumber") {
   val testArray =List(1,-1,2,4,-8,3)
    assert(kpp_scala.getPenultimateNumber(testArray)=== -8)
  }

}
