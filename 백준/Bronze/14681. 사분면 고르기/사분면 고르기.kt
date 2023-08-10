import java.io.BufferedReader

fun main(args: Array<String>) = with(BufferedReader(System.`in`.bufferedReader())) {
	val x = readLine().toInt()
	val y = readLine().toInt()

	val quadrant1 = x > 0 && y > 0
	val quadrant2 = x < 0 && y > 0
	val quadrant3 = x < 0 && y < 0
	val quadrant4 = x > 0 && y < 0

	if (quadrant1) println(1)
	if (quadrant2) println(2)
	if (quadrant3) println(3)
	if (quadrant4) println(4)
}