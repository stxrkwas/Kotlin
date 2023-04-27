//Maria Luiza Passo Silva

//Exercício 5

//Declaração de classe
class Celular(
    
    //Declaração de variáveis
    val marca: String = "",
    val modelo: String = "",
    var preco: Double,
    var desconto: Double)

{

    //Função para calcular o preço do celular com o desconto
    fun precocomDesconto(): Double{
        return preco - (preco * desconto)
    }//Finalizando função precocomDesconto

    //Função para imprimir as informações sobre o celular
    fun imprimeDetalhes(){
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Preço: $preco")
        println("Preço com desconto: $desconto")
    }//Finalizando função imprimeDetalhes

}//Finalizando classe Celular

//Iniciando a função main
fun main(){

    //Criando objeto para instanciar a função imprimeDetalhes
    val celular = Celular("Samsung", "Galaxy S20 plus", 4399.00, 2199.5)
    celular.imprimeDetalhes()
}//Finalizando função main