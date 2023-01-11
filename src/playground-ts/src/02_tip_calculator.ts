// Original flawed OO approach

class TipCalculator1 {
  private names: Array<string> = new Array()
  // storing unnecessary values in state
  // tipPercentage can be derived from existing information
  private tipPercentage: number = 0

  // coupling adding person to name list
  // with calculating tip
  addPerson(name: string): void {
    this.names.push(name)

    if (this.names.length > 5) {
      this.tipPercentage = 20
    } else if (this.names.length > 0) {
      this.tipPercentage = 10
    }
  }

  getNames(): Array<string> {
    return this.names
  }

  getTipPercentage(): number {
    return this.tipPercentage
  }
}

// const tipCalculator = new TipCalculator1()

///////////////////////////////////////////////
// Refactored implementation
// calculates tip percentage on the fly when needed
// stores no state, instead passing names as arguments

{
  class TipCalculator2 {
    // private names: Array<string> = new Array()
  
    // getNames(): Array<string> {
    //   return [ ...this.names ]
    // }
  
    addPerson(names: Array<string>, name: string) {
      return [ ...names, name ]
    }
  
    getTipPercentage(names: Array<string>) {
      return (
        names.length > 5 ? 20 :
        names.length > 0 ? 10 :
        0
      )
    }
  }

  const names: Array<string> = new Array()
}

///////////////////////////////////////////////
// Refactored implementation
{
  const names: Array<string> = []

  const getTipPercentage = (names: Array<string>) => {
    const namesLen = names.length

    return (
      namesLen > 5 ? 20 :
      namesLen > 0 ? 10 :
      0
    )
  }

}


