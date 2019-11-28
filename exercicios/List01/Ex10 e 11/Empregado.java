import javax.lang.model.util.ElementScanner6;

public class Empregado{
    private String nome;
    private float salarioMensal;

    public Empregado(String nome, float salarioMensal){
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    public void setNome(String nome){
        this. nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setSalarioMensal(float salarioMensal){
        if(salarioMensal > 0){
            this.salarioMensal = salarioMensal;
        }else if (salarioMensal < 0){ 
            System.out.println("Não há sálario");
        }else{
            System.out.println("Sálario negativo");
        }
    }
    
    public float getSalarioMensal(){
        return salarioMensal;
    }

    public void imprimirInformacoes(){
        System.out.println("Nome do funcionario: " + getNome());
        System.out.printf("Salario mensal: %.2f\n",  getSalarioMensal());
    }   

}