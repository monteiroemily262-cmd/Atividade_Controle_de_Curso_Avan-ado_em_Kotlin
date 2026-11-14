fun main() {
    var total = 0
    for (i in 1..100) {
        if (i % 10 == 0) {
            continue
        }
        total += i
        if (total > 500) {
            break
        }
    }
    println("Valor final do total: $total")
}
