fun main() {
    var saldo = 1000.0
    val valorSaque = 150.0

    while (true) {
        if (saldo < valorSaque) {
           println("Saldo Insuficiente")
           break
        }
        saldo -= valorSaque
        println("Saque realizado. Saldo atual: $saldo")
    }
}
