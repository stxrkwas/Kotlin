//Maria Luiza Passo Silva

//Exercício 1

//Declaração de classe
class Funcionario
     
    //Declaração de variáveis
    (val nome: String = "", val nasc: String = "", val salario: Double){

        //Iniciando as funções

        //A função informarSalario informa o salário do funcionário
        fun informarSalario(){
            println("O salário do funcionário(a) $nome é: R$ $salario")
        }

        //A função informarIdade informa a idade do funcionário
        fun informarIdade(){
            println("O funcionário(a) $nome nasceu em: $nasc")
        }

        //A função Andar informa se o funcionário está andando
        fun Andar(){
            println("$nome está andando")
        }

        //A função Andar informa se o funcionário está falando
        fun Falar(){
            println("$nome está falando")
        }

        //A função Comer informa se o funcionário está comendo
        fun Comer(){
            println("$nome está comendo uma esfiha")
        }

        //A função Beber informa se o funcionário está bebendo
        fun Beber(){
            println("$nome está bebendo um chá de gengibre, limão e mel")
        }

        //Finalizando as funções

}//Finalizando a classe Funcionario

//Iniciando a função main
fun main(){

    //Criando o objeto TestFunc para instanciar a classe Funcionario
    val TestFunc = Funcionario("Maria Luiza", "11/02", 4400.0)

    //Instanciando as funções
    TestFunc.informarSalario()
    TestFunc.informarIdade()
    TestFunc.Andar()
    TestFunc.Falar()
    TestFunc.Comer()
    TestFunc.Beber()

}//Finalizando a função main