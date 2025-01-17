// object TipCalculator {
//   def getTipPercentage(names: List[String]): Int = {
//     if (names.size > 5) 20
//     else if (names.size > 0) 10
//     else 0
//   }
// }

// object ch02_TipCalculationScala extends App {
//   assert(TipCalculator.getTipPercentage(List.empty) == 0)

//   val smallGroup = List("Alice", "Bob", "Charlie")
//   assert(TipCalculator.getTipPercentage(smallGroup) == 10)

//   val largeGroup = List("Alice", "Bob", "Charlie", "Daniel", "Emily", "Frank")
//   assert(TipCalculator.getTipPercentage(largeGroup) == 20)
// }

object TipCalculator {
  def getTipPercentage(names: List[String]): Int = {
    if (names.size > 5) 20
    else if (names.size > 0) 10
    else 0
  }
}

object ch02_TipCalculationScala extends App {
  val emptyNames = List.empty
  TipCalculator.getTipPercentage(emptyNames)

  val names1 = List("Alice", "Bob", "Charlie")
  TipCalculator.getTipPercentage(names1)

  val names2 = List("Alice", "Bob", "Charlie", "Daniel", "Emily", "Frank")
  TipCalculator.getTipPercentage(names2)
}