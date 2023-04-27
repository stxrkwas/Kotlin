//Maria Luiza Passo Silva 

//Exercício 2

//Importação de classe
import java.util.Scanner 

//Iniciando a função main
fun main(args: Array<String>){
    
    //Cria uma instância que recebe entrada da entrada padrão (teclado)
    val reader = Scanner(System.`in`) 

    //Peso:

    //Exibindo mensagem para o usuário inserir o seu peso em kg:
    println("Insira o seu peso em kg: ")
    //Declaração de variável para a entrada do valor. A função .nextDouble() converte a String para Double. 
    var peso: Double = reader.nextDouble()


    //Altura:

    //Exibindo mensagem para o usuário inserir a sua altura em metros:
    println("Insira o seu peso em metros: ")
    //Declaração de variável para a entrada do valor. A função .nextDouble() converte a String para Double. 
    var altura: Double = reader.nextDouble()


    //Cálculo do IMC (Índice de Massa Corporal):

    //Declaração de variável
    var IMC: Double = (peso / (altura * altura))


    //Estrutura de decisão para descobrir qual é a classificação do usuário em relação ao seu IMC:

    //1ª condicional que será testada caso a condição em if seja verdadeira, no caso, se a classificação do usuário for Magreza
    if(IMC < 18.0){

        //Saída da condição
        println("O IMC do usuário(a) é $IMC \nA sua classificação é: Magreza")

    }//Finalizando if

    //2ª condicional que será testada caso a primeira condição seja falsa, no caso, se a classificação do usuário for Saudável
    else if(IMC > 18.0 && IMC < 24.9){

        //Saída da condição
        println("O IMC do usuário(a) é $IMC \nA sua classificação é: Saudável")

    }//Finalizando if

    //3ª condicional que será testada caso a primeira e segunda condição sejam falsas, no caso, se a classificação do usuário for Sobrepeso
    else if(IMC > 25.0 && IMC < 29.9){

        //Saída da condição
        println("O IMC do usuário(a) é $IMC \nA sua classificação é: Sobrepeso")

    }//Finalizando else if 2

    //4ª condicional que será testada caso as três condições anteriores sejam falsas, no caso, se a classificação do usuário for Obesidade
    else if(IMC >= 30.0){

        //Saída da condição
        println("O IMC do usuário(a) é $IMC \nA sua classificação é: Obesidade")

    }//Finalizando else if 3

}//Finalizando função main