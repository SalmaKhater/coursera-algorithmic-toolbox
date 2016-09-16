
object APlusB {

	def main(args: Array[String]) {
		val Array(a, b) = scala.io.StdIn.readLine().split(" ").map(_.toInt)
		println(a + b)
	}
}