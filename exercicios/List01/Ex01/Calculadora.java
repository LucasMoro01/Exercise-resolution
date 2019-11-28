public class Calculadora{

    //Criação dos métodos a serem realizados para cada funcao que o usuario escolher
    public double soma(double num1, double num2){
      return num1 + num2;
    }
    public double subtrai(double num1, double num2){
      return num1 - num2;
    }
    public double multiplica (double num1, double num2){
      return num1 * num2;
    }
    public double divide (double num1, double num2){
      return num1 / num2;
    }
    public double potencia (double num1, double num2){
        //Neste return possui o typeCasting (int) para poder retornar um valor inteiro.
      return (int)Math.pow(num1, num2);
    }
  }