const planA: string[] = ["Paris", "Berlin", "Krakov"]

// flawed implementation
// mutates existing values
const replan = (
  plan: string[],
  newCity: string,
  beforeCity: string
) => {
  const newCityIndex = plan.indexOf(beforeCity)
  plan.splice(newCityIndex, 0, newCity)
  
  return plan
}

const planB = replan(planA, "Vienna", "Krakov")

/////////////////////////////////////////
const replanPure = (
  plan: string[],
  newCity: string,
  beforeCity: string
) => {
  const newCityIndex = plan.indexOf(beforeCity)

  return [
    ...plan.slice(0, newCityIndex),
    newCity,
    ...plan.slice(newCityIndex)
  ]
}

const planC = replanPure(planA, "Vienna", "Krakov")

''
