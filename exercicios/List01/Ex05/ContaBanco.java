public class ContaBanco {
    //Atributos
    private String nameDono;
    private String cpf;
    private double saldo;
    private boolean status;
    private double limiteChequeEspecial = 100;
    
    
    //Métodos Personalizados

    //Método para exibir na tela o estado atual da conta.
    public void estadoAtual(){
        System.out.println("");
        System.out.println("---- INFORMACOES DO USUARIO----");
        System.out.println("Dono: " + this.getNameDono());
        System.out.println("Saldo: " + this.getSaldo());
        
    }
    
    //Método para depositar, onde o usuário insere um valor e este valor é atribuido ao seu saldo.
    public void depositar(double valor){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado na conta de " + this.getNameDono());
    }
    
    //Método para sacar, onde só realiza o saque se o valor do saque for menor ou igual o saldo atual mais o limite do cheque especial.
    public void sacar(double valor){  
        if (valor < limiteChequeEspecial + this.getSaldo()){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getNameDono());
            }else if(valor > limiteChequeEspecial + this.getSaldo()){
                System.out.println("Este valor de saque é maior que o limite de cheque especial");  
            }
    }

    //Método para calcular taxa de juros, onde ele calcula o juros somente se o saldo estiver negativo.
    public double taxaJuros(){
        double juros;
        if ( saldo < 0){
            juros = (0.02 * limiteChequeEspecial);
        }else
            juros = 0;
        return juros;

    }

    
    //Métodos Especiais Get e Set
    public ContaBanco() {
        this.saldo = 0;
    }

    public String getNameDono() {
        return this.nameDono;
    }

    public void setNameDono(String nameDono) {
        this.nameDono = nameDono;
    }

    public double getSaldo() {  
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    } 

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

}
