import java.io.BufferedReader
import java.util.StringTokenizer

fun main(args: Array<String>) = with(BufferedReader(System.`in`.bufferedReader())) {
	val arr = arrayListOf<Long>()
	val st = StringTokenizer(readLine())

	while (st.hasMoreTokens()) {
		arr.add(st.nextToken().toLong())
	}
	println(arr[0] + arr[1] + arr[2])
}