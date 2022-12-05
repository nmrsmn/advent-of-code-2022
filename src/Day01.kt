fun main() {
    fun part1(input: String): Int {
        return input.split("\n\n").maxOf { elf ->
            elf.lines().sumOf { it.toInt() }
        }
    }

    fun part2(input: String): Int {
        return input.split("\n\n")
            .map { elf -> elf.lines().sumOf { it.toInt() } }
            .sortedDescending()
            .subList(0, 3)
            .sum()
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 24_000)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
