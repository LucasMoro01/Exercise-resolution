public class Salario{

    private double salarioBruto;
    private double inss;
    private double imposto_de_Renda;

    public Salario(double salarioBruto){
        this.salarioBruto = salarioBruto;
    }

    public void calcularImpostoRenda(){
        if (salarioBruto >= 0){
            if (salarioBruto <= 1057.50 ){
                this.imposto_de_Renda = 0;
            }else if (salarioBruto >= 1057.50 && salarioBruto < 2115.00){
                this.imposto_de_Renda = 0.15 * salarioBruto;
            }else if (salarioBruto >= 2115.00 ){
                this.imposto_de_Renda = 0.275 * salarioBruto;
            }
        }else
            System.out.println("Salario inválido");
    }

    public void calcularINSS(){
        if (salarioBruto >= 0){
            if (salarioBruto <= 1500)
                this.inss = 0.10 * salarioBruto;
            else
                this.inss = 150;
        }else
            System.out.println("Salario inválido");
    }

    public double calcularSalarioLiquido(){
        return this.salarioBruto - (this.imposto_de_Renda + this.inss);   
    }


}