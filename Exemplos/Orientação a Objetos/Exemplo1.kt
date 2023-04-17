//Orientação a Objetos - Exemplo 1 (Aula 03 - Kotlin)

class Carro {
    var cor: String = ""
    var modelo: String = ""

    fun acelerar(){
        println("Acelerando")
    }

    fun frear(){
        println("Freando")
    }
}

fun main(args: Array<String>){

    var car = Carro()
    car.cor = "Prata"
    car.modelo = "HB20"
    println(car.cor)
    println(car.modelo)
    car.acelerar();
    car.frear();
}