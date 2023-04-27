//Estruturas de Decisão - When - Exemplo 2 (Aula 02 (Março) - Kotlin)

fun main(){

    cases("Teste")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("")
}

fun cases(obj: Any){

    //1
    when(obj){

        //2
        1 -> println("One")

        //3
        "Ola" -> println("Saudações")

        //4
        is Long -> println("Grande")

        //5
        !is String -> println("Não é uma String")

        //6
        else -> println("Desconhecido")
    }

}

class MyClass