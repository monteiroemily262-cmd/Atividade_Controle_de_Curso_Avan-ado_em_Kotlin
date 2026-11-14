fun main() {
    var numero = 1

    while (true) {
        if(numero % 7 == 0 && numero % 13 == 0) {
            println(numero)
            break
        }
        numero++
    }
}

