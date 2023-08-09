import java.io.BufferedReader

fun main(args: Array<String>) = with(BufferedReader(System.`in`.bufferedReader())) {
	when (readLine().toInt()) {
		in 90..100 -> println("A")
		in 80..89 -> println("B")
		in 70..79 -> println("C")
		in 60..69 -> println("D")
		else -> println("F")
	}
}