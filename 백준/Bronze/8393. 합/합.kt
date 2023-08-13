import java.io.BufferedReader

fun main(args: Array<String>) = with(BufferedReader(System.`in`.bufferedReader())) {
	val count = readLine().toInt()

	var n = 0
	for (i in 1..count) {
		n += i
	}
	println(n)
}