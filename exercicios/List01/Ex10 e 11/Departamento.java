public class Departamento{
    private String nome;
    private Empregado[] empregados = new Empregado[10];

    public Departamento(String nome){
        this.nome = nome;
    }
    
    public void alocarEmpregado(Empregado empregados){
        if(verificaPosicaoDeInsercao() != -1 && empregados != null && empregados.getNome() != null && !verificarEmpregado(empregados.getNome())){
            if(verificaPosicaoDeInsercao() >= 0){
                this.empregados[verificaPosicaoDeInsercao()] = empregados;
                System.out.println("Empregado adicionado");
            }
        }else   
            System.out.println("Impossivel adicionar este empregado");
    }

    public void removerEmpregado(String nome){
        boolean aux = false;
        if(nome != null){
            for(int i = 0; i < this.empregados.length; i++){
                if(this.empregados[i] != null && this.empregados[i].getNome().equals(nome)){
                    empregados[i] = null;
                    aux = true;
                }   
            }
            if(!aux){
                System.out.println("Empregado nao encontrado");
            }

        }else
            System.out.println("Nome invalido");
    }

    public boolean verificarEmpregado(String nome){
        for(int i = 0; i < empregados.length; i++){
            if(empregados[i] != null && empregados[i].getNome().equals(nome)){
                return true;
            }
        }
        return false;
    }
    
    public int verificaPosicaoDeInsercao(){
        for(int i = 0; i < this.empregados.length; i++){
            if(this.empregados[i] == null){
                return i;// Retorna qual a posição do array esta livre
            }
        }
        return -1;// Retorna valor coringa caso o array esteja cheio.
    }

    //Método para imprimir lista de empregados
    public void imprimirEmpregados(){
        for (int j = 0; j < this.empregados.length; j++){
            if(this.empregados[j] != null)
                System.out.println(this.empregados[j].getNome());
        }
    }
    
}