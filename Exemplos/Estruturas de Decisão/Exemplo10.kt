//Estruturas de Decisão - When - Exemplo 6 (Aula 02 (Março) - Kotlin)

fun main(){

    val x = 7

    when (x){

        in 1..10 -> print("x está no intervalo")
        else -> print("x está fora do intervalo")
    }
}