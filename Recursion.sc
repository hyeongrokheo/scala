def pascal(c: Int, r: Int): Int = {
  if (c == r)
    1
  else if (c == 0)
    1
  else
    pascal(c - 1, r - 1) + pascal(c, r - 1)
}

println("Pascal's Triangle")
for (row <- 0 to 5) {
  for (col <- 0 to row)
    print(pascal(col, row) + " ")
  println()
}

def balance(chars: List[Char]): Boolean = {
  def balancef(B: Int, chars: List[Char]): Boolean = {
    if (B < 0)
      false
    else if (chars.isEmpty)
      B == 0
    else if (chars.head == '(')
      balancef(B + 1, chars.tail)
    else if (chars.head == ')')
      balancef(B - 1, chars.tail)
    else
      balancef(B, chars.tail)
  }

  balancef(0, chars)
}

println("Parentheses Balancing")
println(balance("())(".toList))

def countChange(money: Int, coins: List[Int]): Int = {
  if (coins.isEmpty)
    0
  else if (money - coins.head > 0)
    countChange(money - coins.head, coins) + countChange(money, coins.tail)
  else if (money - coins.head == 0)
    1 + countChange(money, coins.tail)
  else
    countChange(money, coins.tail)
}

countChange(4, List(1,2))
