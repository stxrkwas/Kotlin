//Maria Luiza Passo Silva

//Exercício 4

//Declaração de classe
class Empresa(
    
    //Declaração de variáveis
    var funcionario: String = "",
    var salario: Double,
    var ano1: Int,
    var ano2: Int,
    var ano3: Int,
    var aumento: Double,
    var segaumento: Double,
    var salariom: Double,
    var salarioat: Double)

{
    //Funçaõ para calcular o aumento do salário
    fun aumentodoSalario(): Double{
        return salario + (salario * aumento) 
    }//Finalizando função aumentodoSalario

    //Funçaõ para imprimir o salário do funcionário
    fun imprimeSalario(){

        //Saída do nome, ano e salário inicial do funcionário
        println("Nome do funcionáro: $funcionario")
        println("O contrato foi iniciado em: $ano1")
        println("Salário inicial: R$ $salario") 
        println();

        //Saída do ano seguinte, valor do aumento e salário do ano
        println("Ano seguinte: $ano2")
        println("Valor do aumento: R$ $aumento")
        println("Salário durante o ano de $ano2: $salariom")
        println();

        //Saída do ano, valor do aumento e salário atual
        println("Ano atual: $ano3")
        println("Valor do aumento: R$ $segaumento")
        println("Salário atual: $salarioat")
    
    }//Finalizando função imprimirSalario

}//Finalizando classe Empresa

//Iniciando função main
fun main(){
    //Criando o objeto salariof e instanciando o método imprimeSalario
    val salariof = Empresa("Maria Luiza", 1000.00, 2005, 2006, 2007,
    15.00, 300.00, 1015.00, 1315.00)
    salariof.imprimeSalario()
}//Finalizando função main