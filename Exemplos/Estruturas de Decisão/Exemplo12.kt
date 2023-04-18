//Estruturas de Decisão - When - Exemplo 8 (Aula 02 (Março) - Kotlin)

fun main(){

    println(whenAssign("Olá"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}

//obj: Any, é um objeto de qualquer tipo (pelo menos é o que eu acho que significa)
fun whenAssign(obj: Any): Any{

    //1
    val resultado = when (obj){
        
        //2
        1 -> "Uma"

        //3
        "Olá" -> 1

        //4
        is Long -> false

        //5
        else -> 42
    }

    return resultado

}

class MyClass