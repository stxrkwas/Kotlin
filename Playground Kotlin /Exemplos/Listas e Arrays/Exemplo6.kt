//Listas e Arrays - Exemplo 6 (Aula 02 (Março) - Kotlin)

fun main(){

    val lista = mutableListOf(1, 2, 3, 4)
    //A função filter aplica um filtro na lista
    val numerosPares = lista.filter{it % 2 == 0}
    //A variável acima cria uma nova lista chamada numerosPares, que recebe somente os números pares    
    println(numerosPares)

}