object simple {
  def main(args: Array[String]) {
    val elementList = Array[Int](10, 25, 30);
    elementList.foreach((num: Int) => {
      if (num % 2 == 0) {
        println(even(num));
      } else println(odd(num))
    })

  }
  def even(e: Int): Int = {
    val result = e * 2
    return result;
  }
  def odd(o: Int): Int = {
    val result = o * 3
    return result
  }
}
