fun main() {
    val senhaCorreta = "1234"
    val tentativasSimuladas = listOf("0000", "1111", "9999", "1234")

    for (i in 1..5) {
        val tentativa = tentativasSimuladas[i - 1]

        if (tentativa == senhaCorreta) {
            println("Acesso concedido!")
            break
        } else {
            println("Senha incorreta.")
            if (i == 3) {
                println("Cofre travado administrativamente")
                break
            }
        }
    }
}
