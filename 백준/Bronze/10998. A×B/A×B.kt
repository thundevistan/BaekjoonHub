import java.util.StringTokenizer

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
	val arr = ArrayList<Int>()
	val st = StringTokenizer(readLine())

	while (st.hasMoreTokens()) arr.add(st.nextToken().toInt())

	val a: Int = arr[0]
	val b: Int = arr[1]
	println(a * b)
}