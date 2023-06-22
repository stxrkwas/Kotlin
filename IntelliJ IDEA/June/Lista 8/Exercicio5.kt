//Maria Luiza Passo Silva

/*Exercício 5: O restaurante a quilo BEM-VIVER cobra R$12,00 por cada quilo de refeição. Escreva um programa em koltin que leia o peso do prato montado pelo cliente
(em quilos) e imprima o valor a pagar. Assume que a balança já desconte o peso do prato.*/

//Importação de classe
import java.util.Scanner

//Iniciando a função main
fun main(args: Array<String>){

    //Cria uma instância que recebe entrada da entrada padrão (teclado)
    val reader = Scanner(System.`in`)

    //Exibindo mensagem para o usuário informar o peso do prato:
    println("Informe o preço do prato em kg: ")
    //Declaração de variável para a entrada do valor. A função .nextFloat() converte a String para Float.
    val peso = reader.nextFloat()

    //Declaração de variável para calcular o valor total do prato.
    val valor = (peso * 12.00)

    //Saída do resultado:
    println("O valor do prato é: $valor")

}//Finalizando a função main
