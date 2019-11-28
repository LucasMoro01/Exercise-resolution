public class SalarioTeste{
    public static void main (String[] args){

        Salario salario = new Salario(1100);

        salario.calcularINSS();
        salario.calcularImpostoRenda();
        salario.calcularSalarioLiquido();

        System.out.printf("O salario liquido e: %.2f", salario.calcularSalarioLiquido());
    }
}