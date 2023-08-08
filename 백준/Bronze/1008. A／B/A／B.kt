import java.util.StringTokenizer

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
	var arr = ArrayList<Double>()
	val st = StringTokenizer(readLine())

	while (st.hasMoreTokens()) arr.add(st.nextToken().toDouble())

	var a: Double = arr[0]
	var b: Double = arr[1]
	println(a / b)
}