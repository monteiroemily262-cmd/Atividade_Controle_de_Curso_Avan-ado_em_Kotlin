fun main() {
    val entradasSimuladas = listOf(1, 2, 3, 0)
    var indice = 0

    while (true) {
        val opcao = entradasSimuladas[indice++]

        when (opcao) {
            1, 2 -> println("Processando...")
            3 -> {
                println("Módulo em manutenção")
                continue
            }
            0 -> {
            println("Encerrando o programa...")
            break
            }
            else -> println("Opção inválida.")
        }

    }
}
