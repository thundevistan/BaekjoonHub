import java.util.StringTokenizer

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
	val bw = System.out.bufferedWriter()

	repeat(readLine().toInt()) {
		val st = StringTokenizer(readLine())

		val sum = (st.nextToken().toInt() + st.nextToken().toInt()).toString()
		bw.write(sum + "\n")
	}
	close()
	bw.flush()
	bw.close()
}