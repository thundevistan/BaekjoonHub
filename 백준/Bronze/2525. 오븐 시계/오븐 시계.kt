import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
	var h = nextInt()
	var m = nextInt()
	var time = nextInt()

	var hm = m + time
	if (hm < 60) {
		m = hm
	} else {
		h += hm / 60
		m = hm % 60
	}
	if (h > 23) h -= 24

	println("$h $m")
}