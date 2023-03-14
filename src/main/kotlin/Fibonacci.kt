fun fib(steps: Int): Int {
    if (steps == 0) return 0
    if (steps == 1) return 1
    return fib(steps - 1) + fib(steps - 2)
}
