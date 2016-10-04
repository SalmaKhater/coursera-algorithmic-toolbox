object Fibonacci {
	def calculateFib(n: Int): Long = {
		if(n <= 1) n
		else calculateFib(n - 1) + calculateFib(n - 2) 
	}

	def main(args: Array[String]) { 
		val n = scala.io.StdIn.readInt()

		println(calculateFib(n))

	}
}