//Listas e Arrays - Exemplo 1 (Aula 02 (Março) - Kotlin)

fun main(args: Array<String>){

    //Criando variável do tipo Array de números inteiros, os () definem o número de posições do array
    val array: IntArray = intArrayOf(1, 2, 3, 4)

    /*Para acessar ou definir um valor do Array, basta utilizar os colchetes passando sua posição:
    Passando o índice 2, para acessar o valor da posição 2 (Que no caso desse exemplo é o número 3);*/ 
    val x = array[2]
    println("$x")
}