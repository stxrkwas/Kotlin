//Orientação a Objetos: Herança - Exemplo 2 (Aula 03 - Kotlin)

open class Carro{

    var cor: String = ""
    var modelo: String = ""

    fun acelerar(){
        println("Acelerando")
    }

    fun frear(){
        println("Freando")
    }

}

//Criando classe derivada
class CarroEspecial: Carro(){
    
    //Implementação
    fun fazerDrift(){
        println("Classe derivada")
    }
}

fun main(args: Array<String>){

    val c = CarroEspecial()
    c.cor = "Prata"
    c.modelo = "Mark 85"
    println(c.cor)
    println(c.modelo)
    c.acelerar();
    c.frear();
    c.fazerDrift();

}