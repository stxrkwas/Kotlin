//Maria Luiza Passo Silva

//Exercício 2 (Nova tentativa)

//Importação de classe
import java.util.Scanner 

//Iniciando função main
fun main(args: Array<String>){

    //Cria uma instância que recebe entrada da entrada padrão (teclado)
    val reader = Scanner(System.`in`) 

    //Lado A:

    //Exibindo mensagens para o usuário inserir o valor do lado A do triângulo
    println("Insira o valor do lado A: ")
    //Declaração de variável para a entrada do valor. A função .nextDouble() converte a String para Double.
    var a = reader.nextDouble()


    //Lado B:

    //Exibindo mensagens para o usuário inserir o valor do lado B do triângulo
    println("Insira o valor do lado B: ")
    //Declaração de variável para a entrada do valor. A função .nextDouble() converte a String para Double.
    var b = reader.nextDouble() 


    //Lado C:

    //Exibindo mensagens para o usuário inserir o valor do lado C do triângulo
    println("Insira o valor do lado C: ")
    //Declaração de variável para a entrada do valor. A função .nextDouble() converte a String para Double.
    var c = reader.nextDouble()
    

    //Estrutura de decisão para descobrir qual tipo de triângulo é:
    if (a == c && b== c){
        println("Triângulo Equilátero")
    }//Finalizando if

    else if (a == b || b == c || c == a){
        println("Triângulo Isósceles")
    }//Finalizando else if

    else if (a != b && a != c && b != c){
        println("Triângulo Escaleno")
    }//Finalizando else if
    
}//Finalizando função main 