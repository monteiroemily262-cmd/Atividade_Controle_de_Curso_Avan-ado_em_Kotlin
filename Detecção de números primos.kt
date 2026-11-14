fun main() {
    val  numeroAlvo = 29
    var ehPrimo = true

    if (numeroAlvo <= 1) {
        ehPrimo = false
} else {
    for (i in 2 until numeroAlvo) {
        if (numeroAlvo % i == 0){
            ehPrimo = false
            break
        }
    }
}
    if (ehPrimo) {
        println("O número $numeroAlvo é primo.")
    } else {
        println("O número $numeroAlvo não é primo.")
    }
}
