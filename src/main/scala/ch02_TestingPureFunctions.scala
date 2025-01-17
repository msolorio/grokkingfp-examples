def increment(x: Int): Int = {
  x + 1
}

def add(a: Int, b: Int): Int = {
  a + b
}

def wordScore(word: String): Int = {
  word.replaceAll("a", "").length
}

def getTipPercentage(names: List[String]): Int = {
  if (names.size > 5) 20
  else if (names.size > 0) 10
  else 0
}

def getFirstChar(s: String): Char = {
  if (s.length > 0) s.charAt(0)
  else ' '
}

object ch02_TestingPureFunctions extends App {
  increment(1) == 2
  increment(10) == 11

  add(1, 1) == 2
  add(10, 11) == 21

  wordScore("apple") == 4
  wordScore("banana") == 3

  val names = List(
    "Abbot",
    "Bailey",
    "Charles",
    "Dan",
    "Elly",
    "Frank",
    "Gerard"
  )

  getTipPercentage(names) == 20

  getFirstChar("some string") == 's'
}



























// object ch02_TestingPureFunctions extends App {
//   def increment(x: Int): Int = {
//     x + 1
//   }

//   assert(increment(6) == 7)
//   assert(increment(0) == 1)
//   assert(increment(-6) == -5)
//   assert(increment(Integer.MAX_VALUE - 1) == Integer.MAX_VALUE)

//   def add(a: Int, b: Int): Int = {
//     a + b
//   }

//   assert(add(2, 5) == 7)
//   assert(add(-2, 5) == 3)

//   def wordScore(word: String): Int = {
//     word.replaceAll("a", "").length
//   }

//   assert(wordScore("Scala") == 3)
//   assert(wordScore("function") == 8)
//   assert(wordScore("") == 0)

//   def getTipPercentage(names: List[String]): Int = {
//     if (names.size > 5) 20
//     else if (names.size > 0) 10
//     else 0
//   }

//   assert(getTipPercentage(List("Alice", "Bob")) == 10)
//   assert(getTipPercentage(List("Alice", "Bob", "Charlie", "Danny", "Emily", "Wojtek")) == 20)
//   assert(getTipPercentage(List.empty) == 0)

//   def getFirstCharacter(s: String): Char = {
//     if (s.length > 0) s.charAt(0)
//     else ' '
//   }

//   assert(getFirstCharacter("Ola") == 'O')
//   assert(getFirstCharacter("") == ' ')
//   assert(getFirstCharacter(" Ha! ") == ' ')
// }
