// object ch03_ItineraryScala extends App {
//   def replan(plan: List[String], newCity: String, beforeCity: String): List[String] = {
//     val beforeCityIndex = plan.indexOf(beforeCity)
//     val citiesBefore    = plan.slice(0, beforeCityIndex)
//     val citiesAfter     = plan.slice(beforeCityIndex, plan.size)
//     citiesBefore.appended(newCity).appendedAll(citiesAfter)
//   }

//   val planA = List("Paris", "Berlin", "Kraków")
//   println("Plan A: " + planA)

//   val planB = replan(planA, "Vienna", "Kraków")
//   assert(planB == List("Paris", "Berlin", "Vienna", "Kraków"))
//   println("Plan B: " + planB)

//   assert(planA == List("Paris", "Berlin", "Kraków"))
//   println("Plan A: " + planA)
// }

// all List methods return new Lists
// leave original lists unchanged
// all Lists in Scala are immutable
object ch03_ItineraryScala extends App {
  def replan(
    plan: List[String],
    newCity: String,
    beforeCity: String
  ): List[String] = {
    val insertIdx = plan.indexOf(beforeCity)
    val beforeCities = plan.slice(0, insertIdx)
    val afterCities = plan.slice(insertIdx, plan.size)

    beforeCities.appended(newCity).appendedAll(afterCities)
  }
}

// val planA = List("Lisbon", "Madrid", "Berlin")

// replan(planA, "Paris", "Madrid")
