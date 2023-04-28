//Importação de classe
import java.util.Scanner 

//Iniciando função main
fun main(){
    
    //Cria uma instância que recebe entrada da entrada padrão (teclado)
    val reader = Scanner(System.`in`) 
    print("Insira a temperatura em °C: ") 
    // nextDouble() lê a entrada do usuário
    var grausc: Double = reader.nextDouble() 
    //A variavel grausf usa a entrada do usuário para calcular a temperatura em °F
    var grausf: Double = (grausc * 9 + 160) / 5
    println("A temperatura em fahrenheit é: $grausf") 
    
}//Finalizando função main