import java.io.BufferedReader

fun main(args: Array<String>) = with(BufferedReader(System.`in`.bufferedReader())) {
	val x = readLine().toInt()
	val y = readLine().toInt()

	val a: Int = y / 100
	val b: Int = (y % 100) / 10
	val c: Int = y % 10

	println(x * c)
	println(x * b)
	println(x * a)
	println(x * y)
}