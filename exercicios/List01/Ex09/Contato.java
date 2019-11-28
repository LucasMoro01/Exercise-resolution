public class Contato{

    //Atributo
    private String nome;
    private int ddd;
    private int telefone;

    public Contato(String nome,int ddd, int telefone){
        this.nome = nome;
        this.ddd = ddd;
        this.telefone = telefone;
    }
    public Contato(String nome) {
        this.nome = nome;
        this.ddd = 0;
        this.telefone = 0;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getDdd(){
        return ddd;
    }

    public void setDdd(int ddd){
        this.ddd = ddd;
    }


    public int getTelefone(){
        return telefone;
    }

    public void setTelefone(int telefone){
        this.telefone = telefone;
    }

    public boolean equals(Contato contato){

        if(this.nome.equalsIgnoreCase(contato.getNome())){
            return true;

        }
        
        return false;
    }
    
    public String exibirContato(){
        return "Nome: " + nome + "\nTelefone: " + ddd + telefone;
    }

    /*@Override
    public String toString() {
        return "Nome: " + nome + "\nTelefone: " + ddd + telefone;
    }*/

}
