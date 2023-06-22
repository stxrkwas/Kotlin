//Maria Luiza Passo Silva

/*Exercício 4: Escreva um programa em kotlin para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida ela possui.
Considere sempre anos completos, e que um ano possui 365 dias. Ex: uma pessoa com 19 anos possui 6935 dias de vida; veja um exemplo de saída:
JSILVA, VOCÊ JÁ VIVEU 6935 DIAS.
 */

//Importação de classe
import java.util.Scanner

//Iniciando a função main
fun main(args: Array<String>){

    //Cria uma instância que recebe entrada da entrada padrão (teclado)
    val reader = Scanner(System.`in`)

    //Exibindo mensagem para o usuário informar seu nome:
    println("Qual é o seu nome?: ")
    //Declaração de variável para a entrada do valor.
    val name = reader

    //Exibindo mensagem para o usuário inserir a sua idade:
    println("Insira a sua idade: ")
    //Declaração de variável para a entrada do valor. A função .nextInt() converte a String para Int.
    val age = reader.nextInt()

    //Declaração de variável para informar calcular a idade em dias.
    val idade = (age * 365)

    //Saída do resultado:
    println("$name, você já viveu $idade dias.")

}//Finalizando a função main