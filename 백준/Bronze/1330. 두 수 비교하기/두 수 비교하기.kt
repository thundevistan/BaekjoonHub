import java.io.BufferedReader
import java.util.StringTokenizer

fun main(args: Array<String>) = with(BufferedReader(System.`in`.bufferedReader())) {
	val arr = arrayListOf<Int>()
	val st = StringTokenizer(kotlin.io.readLine())

	while (st.hasMoreTokens()) { arr.add(st.nextToken().toInt()) }
	val a = arr[0]
	val b = arr[1]

	if (a > b) println('>')
	if (a < b) println('<')
	if (a == b) println("==")
}