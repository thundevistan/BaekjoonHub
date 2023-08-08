import java.util.StringTokenizer

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
	var arr = ArrayList<Int>()
	val st = StringTokenizer(readLine())

	while (st.hasMoreTokens()) arr.add(st.nextToken().toInt())

	var a: Int = arr[0]
	var b: Int = arr[1]
	println(a + b)
	println(a - b)
	println(a * b)
	println(a / b)
	println(a % b)
}