//Classe de dados - Calculadora (Aula 03 - Kotlin)

//Serve para agrupar classes relacionadas
package classes

class Calculadora {

    //Declarando uma variável do tipo privada
    private var resultado: Int = 0

    //Vararg serve para passar um número de valores para um parâmetro
    fun somar(vararg valores: Int): Calculadora{

        /*A função forEach serve para percorrer uma lista, realizando alguma ação em seus elementos.
        A variável it representa, dentro do bloco forEach, o elemento da lista que está sendo repetido.*/
        valores.forEach{resultado += it}
        return this
    }

    fun multiplicar(valor: Int): Calculadora{
        resultado *= valor
        return this
    }

    fun limpar(): Calculadora{
        resultado = 0
        return this
    }

    fun print(): Calculadora{
        println(resultado)
        return this
    }

    fun obterResultado(): Int{
        return resultado
    }
}

fun main(args: Array<String>){

    val calculadora = Calculadora()
    calculadora.somar(1, 2, 3).multiplicar(3).print()
    calculadora.somar(7, 10).print().limpar()
    println(calculadora.obterResultado())
}
