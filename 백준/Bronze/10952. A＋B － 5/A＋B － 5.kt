import java.util.StringTokenizer

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
	val bw = System.out.bufferedWriter()


	while (true) {
		val v = readLine()

		if (v != "0 0") {
			val st = StringTokenizer(v)
			val sum = (st.nextToken().toInt() + st.nextToken().toInt()).toString()

			bw.write("$sum\n")
		} else break
	}
	close()
	bw.flush()
	bw.close()
}