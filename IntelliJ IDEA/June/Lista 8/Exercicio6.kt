//Maria Luiza Passo Silva

/*Exercício 6: Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo vendida respectivamente por 10, 12 e 15 reais. Construa um programa em que o usuário forneça a quantidade de camisetas pequenas,
médias e grandes referentes a uma venda, e a máquina informe quanto será o valor arrecadado.*/

//Importação de classe
import java.util.Scanner

//Iniciando a função main
fun main(args: Array<String>){

    //Cria uma instância que recebe entrada da entrada padrão (teclado)
    val reader = Scanner(System.`in`)

    //Declaração de variáveis para receber a quantidade de camisas compradas.
    val pequeno = reader.nextInt()
    val medio = reader.nextInt()
    val grande = reader.nextInt()

    //Declaração de variável para calcular o valor arrecadado.
    val total = (pequeno * 10.00) + (medio * 12.00) + (grande * 15.00)

    //Exibindo mensagem para o usuário informar a quantidade de camisas compradas e o valor total arrecadado.
    println("Quantidade de camisas compradas: ")
    println("")
    println("Camisas pequenas: $pequeno")
    println("Camisas médias: $medio")
    println("Camisas grandes: $grande")
    println("")
    println("Valor total arrecadado: $total ")

}//Finalizando a função main
