//Maria Luiza Passo Silva

//Exercício 2

//Declaração de classe
class Sobreposicao {

    //Iniciando função square do tipo Int
    fun square(i: Int): Int{
        //Retornando a multiplicação a função main
        return i*i
    }//Finalizando função

    //Iniciando função quadrado do tipo Double
    fun quadrado(f: Double): Double{
        //Retornando a multiplicação a função main
        return f*f
    }//Finalizando função

}//Finalizando classe Sobreposicao

//Iniciando a função main
fun main(){

    //Instanciando a classe Sobreposicao e criando o objeto sobre, que contém as propriedades de classe
    val sobre = Sobreposicao()

    //Saída dos valores
    println("Quadrado de 3:  " + sobre.square(3))
    println("Quadrado de 3,5:  " + sobre.quadrado(3.5))

}//Finalizando função main