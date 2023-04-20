//Maria Luiza Passo Silva

//Exercício 3

//Importação de classe
import java.util.Scanner 

//Iniciando a função main
fun main(){
    
    //Cria uma instância que recebe entrada da entrada padrão (teclado)
    val reader = Scanner(System.`in`) 

    //Mês:

    //Exibindo mensagem para o usuário inserir um número que corresponda a um mês:
    println("Insira um número de 1 a 12: ")
    //Declaração de variável para a entrada do valor. A função .nextInt() converte a String para Int. 
    var mes = reader.nextInt()


    //Estrutura de decisão para descobrir a qual mês do ano o número digitado pelo usuário corresponde:

    //Declaração de variável, que vai receber a variável mes dentro do comando when (looping), apenas o caso verdadeiro será executado 
    val month = when(mes){

        1 -> "Esse número corresponde ao mês de Janeiro"
        2 -> "Esse número corresponde ao mês de Fevereiro"
        3 -> "Esse número corresponde ao mês de Março"
        4 -> "Esse número corresponde ao mês de Abril"
        5 -> "Esse número corresponde ao mês de Maio"
        6 -> "Esse número corresponde ao mês de Junho"
        7 -> "Esse número corresponde ao mês de Julho"
        8 -> "Esse número corresponde ao mês de Agosto"
        9 -> "Esse número corresponde ao mês de Setembro"
        10 -> "Esse número corresponde ao mês de Outubro"
        11 -> "Esse número corresponde ao mês de Novembro"
        12 -> "Esse número corresponde ao mês de Dezembro"
        else -> "Esse número não corresponde a um mês"

    }//Finalizando when

    //Saída do looping
    println(month)

}//Finalizando função main