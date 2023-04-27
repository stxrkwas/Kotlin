//Maria Luiza Passo Silva

//Exercício 1

//Importação de classe
import java.util.Scanner 

//Iniciando a função main
fun main(args: Array<String>){

    //Cria uma instância que recebe entrada da entrada padrão (teclado)
    val reader = Scanner(System.`in`) 

    //Exibindo mensagem para o usuário inserir o hora do início do turno de trabalho:
    println("A que horas se inicia o seu turno de trabalho? \n(Insira a hora em número decimal)")
    //Declaração de variável para a entrada do valor. A função .nextDouble() converte a String para Double. 
    var horario = reader.nextDouble()

    //Estrutura de decisão para descobrir em qual turno o usuário trabalha:

    //1ª condicional que será testada caso a condição em if seja verdadeira, no caso, se o usuário trabalhar no turno da manhã 
    if(horario > 5.0 && horario < 12.59){

        //Saída da condição
        println("Você trabalha no turno da manhã")

    }//Finalizando if

    //2ª condicional que será testada caso a condição em if seja falsa, no caso, se o usuário trabalhar no turno da tarde
    else if(horario > 13.0 && horario < 20.59){

        //Saída da icondição
        println("Você trabalha no turno da tarde")

    }//Finalizando else if

    //3ª condicional que será testada caso as duas primeiras condições sejam falsas, no caso, se o usuário trabalhar no turno da noite
    else if(horario > 21.0 && horario < 4.59){

        //Saída da condição
        println("Você trabalha no turno da noite")

    }//Finalizando else if 2


}//Finalizando função main