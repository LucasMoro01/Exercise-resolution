public class AgendaTelefone{
    
    //Atributos
    private Contato[] contatos;
    
    //Método Construtor
    public AgendaTelefone(){
        this.contatos = new Contato[50];
    }

    public AgendaTelefone(int tamanho){
        this.contatos = new Contato[tamanho];
    }

    //Métodos

    //Método para verificar se o contato ja existe
    public boolean contatoExistente(Contato c) {

        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null && c.equals(contatos[i])) {
                return true;
            }
        }
        return false;

    }

    //Método para saber se o vetor esta vazio..
    public int posicaoVetorVazio(){

        int contVazio = 0;
        for(int i = 0; i < contatos.length; i++){
            if(contatos[i]==null){
                contVazio++;
            }
        }
        return contVazio;
    }

    //Método para verificar se a agenda esta cheia
    public boolean verificarAgenda() {

        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                return false; //Não esta cheia
            }
        }

        return true;//Está cheia

    }

    //Método para adicionar um contato na agenda.
    public void adicionarContato(Contato c){

        if(contatoExistente(c)){//Serve para mostrar se o contato existe.
            System.out.println("Ja existe contato com este nome!");
        }else if (verificarAgenda()) { //Saber se a agenda esta cheia.
            System.out.println("Agenda cheia!");
        }else{
            boolean encontrado = false;
            for (int i =0; i < contatos.length && !encontrado; i++){
                if(contatos[i] == null){
                    contatos[i] = c;
                    encontrado = true;
                }
            }
    
            if(encontrado)
                System.out.println("Contado adicionado!");
            else
                System.out.println("Nome invalido, já possui contato com este nome"); 
        }

    }

    //Método para imprimir a agenda.
    public void imprimirAgenda(){

        if (posicaoVetorVazio() == contatos.length){
            System.out.println("Não existe contatos para mostrar!");
        }else {
            for (int i =0; i < contatos.length; i++){
                if(contatos[i] != null){
                    System.out.println(contatos[i].exibirContato());
                }
            }   
        }
    }

    //Método para pesquisar contato
    public void pesquisarNome(String nome){     
        boolean encontrado = false;
        for (int i =0; i < contatos.length && !encontrado; i++){
            if(contatos[i] != null && contatos[i].getNome().equalsIgnoreCase(nome)){
                System.out.println("Telefone do contato e: " + contatos[i].getDdd() + contatos[i].getTelefone());
                encontrado = true;
            }
        }

        if(!encontrado)
            System.out.println("Contato não encontrado!");

    }


    //Método para remover contato
    public void removerContato(Contato c){
        boolean encontrado = false;
        for (int i =0; i < contatos.length && !encontrado; i++){
            if(contatos[i] != null && contatos[i].equals(c)){
                contatos[i] = null;
                encontrado=true;
            }
        }

        if(encontrado){
            System.out.println("Contato Removido");
        }else 
            System.out.println("Contato não existe");
    }

}
