//Funções - Exemplo 1 (Aula 3 - Kotlin)

fun main(args: Array<String>){
    val n1 = 5
    val n2 = 7
    val resultado = somar(n1, n2)
        imprimir("A soma de $n1 + $n2 = $resultado")
}

fun somar(n1: Int, n2: Int): Int{
    return n1 + n2
}

fun imprimir(texto: String){
    println(texto)
}