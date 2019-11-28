package ex07;

/**
 *
 * @author lucas
 */
public class Biblioteca {
    
    //Atributos
    private Livro[] livros;
    public int tamanhoAcervo;
    
    //Método Construtor
    public Biblioteca(){
        this.livros = new Livro[1000];
    }
    
    public Biblioteca(int tamanho){
        this.livros = new Livro[tamanhoAcervo];
    }
    
    public boolean livroExiste(Livro l){
        for (int i= 0; i < livros.length; i++){
            if (livros[i] != null && l.equals(livros[i])){
                return true;
            }
        }
        return false;
    }
    
    public void ImprimirAcervo(){
        if (verificarPosicaoVetor() == livros.length){
            System.out.println("Não existe livros neste acervo!");
        }else{
            for(int i = 0; i < livros.length; i++){
                if ( livros[i] != null){
                    System.out.println(livros[i].exibirLivro());
                    System.out.println("");
                }
            }
        }
    }
    
    public void adicionarLivro(Livro l){
        if(livroExiste(l)){
            System.out.println("Livro ja existe no acervo!");
        }else if(verificarAcervo()){
            System.out.println("Acervo cheio!");
        }else{
            boolean encontrado = false;
            for (int i = 0; i < livros.length && !encontrado; i++){
                if(livros[i] == null){
                    livros[i] = l;
                    encontrado = true;
                }
            }
            if(encontrado)
                System.out.println("Livro adicionado!");
            else
                System.out.println("Nome invalido, ja possui livro com este nome");
        }
    }
    
    public void removerLivro(Livro l){
        boolean encontrado = false;
        for (int i = 0; i < livros.length && !encontrado; i++){
            if(livros[i] == null && livros[i].equals(l)){
                livros[i] = null;
                encontrado = true;
            }
        }
        
        if(encontrado)
            System.out.println("Livro removido!");
        else
            System.out.println("Livro não existe!");
    }
    
    public int verificarPosicaoVetor(){
        int contVazio = 0;
        for(int i =0; i < livros.length; i++){
            if(livros[i] == null){
                contVazio++;
            }
        }
        return contVazio;
    }
    
    public boolean verificarAcervo(){
        for(int i =0; i < livros.length; i++){
            if(livros[i] == null){
                return false; //Acervo não está cheio
            }
        }
        return true; //Acervo cheio
    }
    
    public void pesquisarLivro(String nomeLivro){
        boolean encontrado = false;
        for(int i = 0; i < livros.length && !encontrado; i++){
            if(livros[i] != null && livros[i].getNomeLivro().equalsIgnoreCase(nomeLivro)){
                System.out.println(livros[i].exibirLivro());
                encontrado = true;
            }
        }
        if(!encontrado)
            System.out.println("Livro não encontrado");
    }
    
    
}
