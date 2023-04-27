//Strings e Caracteres - Exemplo 2 (Aula 02 (Março) - Kotlin)

fun main(args: Array<String>){

    val nomeUsuario = "JSilva"
    val saudacao = "Bem-vindo, $nomeUsuario"
    println(saudacao)

    //Exemplo de texto com mais de uma linha
    val text = """
    Exemplo de texto
    com mais de uma 
    linha """
    println(text)

}