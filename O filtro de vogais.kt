fun main() {
    val palavra = "Universidade"
    val vogais = arrayOf('a','e','i','o','u','A', 'E', 'I', 'O','U')

    for (caractere in palavra) {
        if (caractere in vogais) {
           continue
        }
        println(caractere)
    }
}
