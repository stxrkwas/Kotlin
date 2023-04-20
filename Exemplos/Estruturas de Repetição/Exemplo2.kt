//Estruturas de Repetição - For - Exemplo 2 (Aula 02 (Março) - Kotlin)

fun main(){

    val lista = listOf (1, 2, 3, 4)

    for (//Declaração de variáveis
        (indice, valor) 
        
        /*In faz uma varredura de todos os valores existentes dentro de uma variável. 
        WithIndex indica a posição do valor na lista.*/
        in lista.withIndex()){
        println("Índice: $indice   Valor: $valor")
    }

}