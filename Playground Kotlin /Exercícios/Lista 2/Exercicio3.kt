//Maria Luiza Passo Silva

//Exercício 3

//Declaração de classe
open class Externa {

    //Declaração de variável
    val x = 7

    //Iniciando a função instanciaInterna
    fun instanciaInterna(){
        //Instanciando a classe interna e criando o objeto int, que contém as propriedades da classe
        val int = interna()
        //Chamando a função imprimeExterna
        int.imprimeExterna()
    }//Finalizando a função instanciaInterna

    //Declaração de classe derivada
    class interna: Externa(){

        //Iniciando função imprimeExterna
        fun imprimeExterna(){
            //Saída da função
            println("x vale $x")
        }//Finalizando função imprimeExterna

    }//Finalizando classe derivada

}//Finalizando classe Externa

//Iniciando função main
fun main(){
    
    //Instanciando a classe Externa e criando o objeto ex, que contém as propriedades da classe
    val ex = Externa()
    //Chamando a função instanciaInterna
    ex.instanciaInterna()

}//Finalizando função main