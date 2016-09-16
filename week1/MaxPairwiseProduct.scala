object  MaxPairwiseProduct {
	def getMaxPairwiseProduct(numbers: Array[Int]): Int = {
		val max1 = numbers.max
		val max2 = (numbers.filter(_ != max1)).max
		max1 * max2
	}

	def main(args: Array[String]) { 
		val n = scala.io.StdIn.readInt()
		val numbers = scala.io.StdIn.readLine().split(" ").map(_.toInt)

		println(getMaxPairwiseProduct(numbers))

	}

}