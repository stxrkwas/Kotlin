//Maria Luiza Passo Silva

//Exercício 3

//Importação de classe
import java.util.Scanner 

//Iniciando função main
fun main(args: Array<String>){

    //Cria uma instância que recebe entrada da entrada padrão (teclado)
    val reader = Scanner(System.`in`) 

    //Altura:

    //Exibindo mensagem para o usuário inserir sua altura:
    println("Insira sua altura: ")
    //Declaração de variável para a entrada do valor. A função .nextDouble() converte a String para Double.
    var altura = reader.nextDouble()

    //Sexo:

    //Exibindo mensagem para o usuário inserir seu gênero:
    println("Insira seu sexo: \n1 - Feminino \n2 - Masculino")
    var sexo = reader.nextInt()


    //Estrutura de decisão para descobrir se o usuário é do sexo feminino ou feminino

    //1ª condicional que será testada caso a condição em if seja verdadeira, no caso, se o usuário for do sexo feminino
    if (sexo == 1){

        //Declaração de variável
        var feminino: Double = (62.1 * altura) - 47
        println("O peso ideal para a usuária é: $feminino")

    }//Finalizando if

    //2ª condicional que será testada caso a condição em if seja falsa, no caso, se o usuário for do sexo masculino
    else if (sexo == 2){

        //Declaração de variável
        var masculino: Double = (72.7 * altura) -58
        println("O peso ideal para  usuário é: $masculino")

    }//Finalizando else if

}//Finalizando função main