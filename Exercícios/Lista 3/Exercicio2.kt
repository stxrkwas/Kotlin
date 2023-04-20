//Maria Luiza Passo Silva 

//Exercício 2

//Iniciando função main
fun main(args: Array<String>){ 

    //Lado A:

    //Exibindo mensagem para o usuário inserir o valor do lado do triângulo
    println("Insira o valor do lado A: ")
    //Declaração de variável para a entrada do valor. A função readLine() lê a entrada do usuário.
    var a = readLine()!!

    
    //Lado B:

    //Exibindo mensagem para o usuário inserir o valor do lado do triângulo
    println("Insira o valor do lado B: ")
    //Declaração de variável para a entrada do valor. A função readLine() lê a entrada do usuário.
    var b = readLine()!!


    //Lado C:

    //Exibindo mensagem para o usuário inserir o valor do lado do triângulo
    println("Insira o valor do lado C: ")
    //Declaração de variável para a entrada do valor. A função readLine() lê a entrada do usuário.
    var c = readLine()!!
    

    //Estrutura de decisão para descobrir qual tipo de triângulo é:
    if (a == b && b == c){
        println("Triângulo Equilátero")
    }//Finalizando if

    else if (a == b || b == c || c == a){
        println("Triângulo Isósceles")
    }//Finalizando else if

    else if (a != b && a!= c && b != c){
        println("Triângulo Escaleno")
    }//Finalizando else if
    
}//Finalizando função main 