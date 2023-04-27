//Maria Luiza Passo Silva

//Exercício 3

//Iniciando função main
fun main(args: Array<String>){

    //Declaração de variáveis 
    val nome = "Maria Luiza"
    val nota1 = 10
    val nota2 = 9
    val nota3 = 7
    val media = (nota1 + nota2 + nota3) / 3

    //Estrutura de decisão para verificar a média do aluno durante o semestre
    if (media >= 7){
        //Saída do resultado
        println("O aluno(a) $nome está aprovado")
        println("Sua média é $media")
    }//Finalizando if

    else if (media <= 5){
        //Saída do resultado
        println("O aluno(a) $nome está reprovado")
        println("Sua média é $media")
    }//Finalizando else if

}//Finalizando função main


