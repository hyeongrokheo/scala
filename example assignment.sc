def sum(xs: List[Int]): Int = {
  if(xs.isEmpty)
    return 0
  else
    return xs.head + sum(xs.tail)
}

def max(xs: List[Int]): Int = {
  def maxf(m: Int, xt: List[Int]): Int = {
    if (xt.isEmpty)
      return m
    if (m > xt.head)
      return maxf(m, xt.tail)
    else
      return maxf(xt.head, xt.tail)
  }

  maxf(xs.head, xs.tail)
}

sum(List(1,2,3,2,1))
max(List(1,2,3,2,1))
