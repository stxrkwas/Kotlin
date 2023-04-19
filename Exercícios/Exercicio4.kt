//Maria Luiza Passo Silva

//Exercício 4

//Declaração de classe 
class Func(
    
    //Declaração de variáveis
    var nome: String = "", var rg: String = "", var cpf: String = "", var idade: Int, var endereco: String = "", 
    var foneResidencial: String = "", var foneComercial: String = "", var celular: String = "", var nomePai: String = "",
    var nomeMae: String = "",  var nomeConjuge: String = "", var sexo: String = ""){

        //Declarando função cadastrarPesssoa
        fun cadastrarPessoa(){
            println("O funcionário(a) $nome está cadastrado(a)")
        }//Finalizando função cadastrarPesssoa

        //Declarando função listarCadastro
        fun listarCadastro(){

            //Declaração de variável para atribuir um número ao cadastro do funcionário
            var cad: Int = 10

            /*Saídas da função listarCadastro:
            
            Número do cadastro:*/
            println("O número do cadastro do funcionário(a) $nome é: $cad")
            println()

            //Dados do funcionário
            println("Dados: ")
            println()
            println("Nome: $nome")
            println("RG: $rg")
            println("CPF: $cpf")
            println("Idade: $idade")
            println("Endereço: $endereco")
            println("Telefone Residencial: $foneResidencial")
            println("Telefone Comercial: $foneComercial")
            println("Nome do Pai: $nomePai")
            println("Nome da Mãe: $nomeMae")
            println("Cônjuge: $nomeConjuge")
            println("Sexo: $sexo")

        }//Finalizando função listarCadastro

}//Finalizando classe Func

//Iniciando função main
fun main(){

    //Instanciando a classe Func e criando o objeto funcionario, que contém as propriedades da classe
    val funcionario = Func("Maria Luiza Passo Silva", "5423027-10", "2896657976-09", 17, "Av. Águia de haia, 211",
    "4002-8922", "0536-9800", "93567-0892", "João", "Eliene", "Peter", "Feminino")

    //Instanciando as funções
    funcionario.cadastrarPessoa()
    funcionario.listarCadastro()

}//Finalizando a função main
