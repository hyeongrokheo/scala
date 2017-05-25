def sum(xs: List[Int]): Int = {
  if(xs.isEmpty)
    0
  else
    xs.head + sum(xs.tail)
}

def max(xs: List[Int]): Int = {
  def maxf(m: Int, xt: List[Int]): Int = {
    if (xt.isEmpty)
      m
    else if (m > xt.head)
      maxf(m, xt.tail)
    else
      maxf(xt.head, xt.tail)
  }

  maxf(xs.head, xs.tail)
}

sum(List(1,2,3,2,1))
max(List(1,2,3,2,1))
