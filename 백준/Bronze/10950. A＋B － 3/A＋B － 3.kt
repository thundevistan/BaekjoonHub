import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
	val count = nextInt()

	repeat(count) {
		var a = nextInt()
		var b = nextInt()
		println("${a + b}")
	}
}