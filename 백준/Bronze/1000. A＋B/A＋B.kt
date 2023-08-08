import java.io.BufferedReader
import java.util.StringTokenizer

fun main(args:Array<String>) {
	val br = BufferedReader(System.`in`.bufferedReader())
	val arr = ArrayList<Int>()
	val st = StringTokenizer(br.readLine())

	while (st.hasMoreTokens()) arr.add((st.nextToken().toInt()))

	val a = arr[0]
	val b = arr[1]

	print(a + b)
}