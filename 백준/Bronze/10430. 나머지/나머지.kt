import java.util.StringTokenizer

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
	val arr = arrayListOf<Int>()
	val st = StringTokenizer(readLine())

	while (st.hasMoreTokens()) arr.add(st.nextToken().toInt())
	val a = arr[0]
	val b = arr[1]
	val c = arr[2]

	println((a+b)%c)
	println(((a%c) + (b%c))%c)
	println((a*b)%c)
	println(((a%c) * (b%c))%c)
}