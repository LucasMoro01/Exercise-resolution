import java.util.Scanner;

public class CalculadoraTeste{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    //Cria um objeto da classe Calculadora e o atribui a CalculadoraTeste
    Calculadora resultado = new Calculadora();
    
    //Declaração das variáveis
    double num1, num2, resultado1 = 0;
    String funcao;
    //Prinst e Leitura dos dados inseridas pelo usuário
    System.out.println("Digite o primeiro valor:");
    num1 = scan.nextDouble();
    System.out.println("Digite o segundo valor:");
    num2 = scan.nextDouble();
    //Este nextLine tem a funcionalidade de consumir o \n que sobrou do scan anterior
    scan.nextLine();
    System.out.println("Digite a operacao a ser realizada:");
    funcao = scan.nextLine();
    
    //Se a funcao digitada for soma, então chama o método soma
    if (funcao.equals("soma")){
      resultado.soma(num1, num2);
      resultado1  = resultado.soma(num1, num2);
    }
    //Se a funcao digitada for subtrai, então chama o método subtrai
    if (funcao.equals("subtrai")){
      resultado.subtrai(num1, num2);
      resultado1  = resultado.subtrai(num1, num2);
    }
    //Se a funcao digitada for multiplica, então chama o método multiplica
    if (funcao.equals("multiplica")){
      resultado.multiplica(num1, num2);
      resultado1  = resultado.multiplica(num1, num2);
    }
    //Se a funcao digitada for divide, então chama o método divide
    if (funcao.equals("divide")){
        //Se o num2 for 0, então a divisão não pode ser efetuada, logo apareça a mensagem de número inválido
        if (num2 == 0)
            System.out.println("Número invalido");
        else{
            resultado.divide(num1, num2);
            resultado1  = resultado.divide(num1, num2);
        }
    }
    //Se a funcao digitada for divide, então chama o método divide
    if (funcao.equals("potencia")){
      resultado.potencia(num1, num2);
      resultado1  = resultado.potencia(num1, num2);
    }
    //Exibe na tela o resultado
    System.out.printf("O resultado e: %.2f ", resultado1);
    //Fechamento do scan
    scan.close();
  }
}