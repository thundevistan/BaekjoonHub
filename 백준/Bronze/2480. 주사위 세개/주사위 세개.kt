import java.io.BufferedReader
import java.util.StringTokenizer

fun main(args: Array<String>) = with(BufferedReader(System.`in`.bufferedReader())) {
	val arr = arrayListOf<Int>()
	val st = StringTokenizer(readLine())

	while (st.hasMoreTokens()) {
		arr.add(st.nextToken().toInt())
	}

	val case = arr[0] == arr[1] && arr[0] == arr[2]
	val case2 =
		(arr[0] == arr[1] && arr[0] != arr[2]) || (arr[0] == arr[2] && arr[0] != arr[1]) || (arr[1] == arr[2] && arr[1] != arr[0])
	val case3 = arr[0] != arr[1] && arr[0] != arr[2] && arr[1] != arr[2]

	if (case) println(10000 + arr[0] * 1000)
	if (case2) {
		if (arr[0] == arr[1]) println(1000 + arr[0] * 100)
		if (arr[0] == arr[2]) println(1000 + arr[0] * 100)
		if (arr[1] == arr[2]) println(1000 + arr[1] * 100)
	}
	if (case3) println(arr.max() * 100)
}