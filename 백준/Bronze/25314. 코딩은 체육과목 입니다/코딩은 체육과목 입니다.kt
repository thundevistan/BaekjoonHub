import java.io.BufferedReader

fun main(args: Array<String>) = with(BufferedReader(System.`in`.bufferedReader())) {
	val n = readLine().toInt()
	val long = "long"
	val cnt = n / 4

	repeat(cnt) { print("$long ") }
	println("int")
}