//Operadores Booleanos - Exemplo 1 (Aula 02 (Março) - Kotlin)

fun main(args: Array<String>){

    val b1 = true
    val b2 = false

    /*Uso da tabela verdade. E = and; OU = or; NÂo = not;*/

    //Retorno será false
    val c1 = b1.and(b2)

    //Retorno será true
    val c2 = b1.or(b2)

    //Retorno será false
    val c3 = b1.not()
    println("$c1, $c2, $c3")
    
}
