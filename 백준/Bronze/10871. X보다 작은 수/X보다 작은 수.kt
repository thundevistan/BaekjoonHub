import java.util.StringTokenizer

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
	val arr1 = ArrayList<Int>()
	val arr2 = ArrayList<Int>()
	val st1 = StringTokenizer(readLine())
	val st2 = StringTokenizer(readLine())

	while (st1.hasMoreTokens()) {
		arr1.add(st1.nextToken().toInt())
	}
	val x: Int = arr1[1]

	while (st2.hasMoreTokens()) {
		arr2.add(st2.nextToken().toInt())
	}

	val result = ArrayList<Int>()
	for (i in arr2) {
		if (i < x) result.add(i)
	}
	result.forEach { print("$it ") }
}