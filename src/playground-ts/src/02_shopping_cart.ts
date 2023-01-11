// A flawed OO implementation using
// unnecessary state and impure functions

class ShoppingCart {
  private items: Array<string> = new Array()
  private bookAdded = false

  addItem(item: string): void {
    this.items.push(item)

    if (item === 'Book') {
      this.bookAdded = true
    }
  }

  getDiscountPercentage() {
    if (this.bookAdded) {
      return 5
    } else {
      return 0
    }
  }

  getItems() {
    // return this.items
    // - now return a copy to mitigate allowing mutations
    // on original array
    return [ ...this.items ]
  }

  // Adds interface to remove item
  // improperly resets bookAdded to false
  removeItem(item: string) {
    this.items = this.items.filter(i => i !== item)

    if (item === 'Book') {
      this.bookAdded = false
    }
  }
}

// Refactored implemenatation using a simplified state
// Better and less error prone
class ShoppingCart2 {
  private items: Array<string> = new Array()

  addItem(item: string): void {
    this.items.push(item)
  }

  getDiscountPercentage(): number {
    return this.items.includes('Book')
      ? 5
      : 0
  }

  getItems(): Array<string> {
    return [ ...this.items ]
  }

  // Adds interface to remove item
  // improperly resets bookAdded to false
  removeItem(item: string): void {
    this.items = this.items.filter(i => i !== item)
  }
}

// Refactored implementation separating state from pure functions
// Much simpler

{
  const getDiscountPercentage = (items: Array<string>) => {
    return items.includes('Book')
      ? 5
      : 0
  }

  const items: Array<string> = []
}


////////////////////////////////////////////
class ShoppingCart3 {
  getDiscountPercentage(items: Array<string>): number {
    return (
      items.includes('Book')
      ? 5
      : 0
    )
  }
}