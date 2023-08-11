import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
	val n = nextInt()

	repeat(9) {
		println("$n * ${it + 1} = ${n * (it + 1)}")
	}
}