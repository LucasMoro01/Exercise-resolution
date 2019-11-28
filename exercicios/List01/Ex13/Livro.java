package ex07;

/**
 *
 * @author lucas
 */
public class Livro {
    private String nomeLivro;
    private int quantidadePaginas;
    private String autorLivro;
    private String dataLancamentoLivro;
    
    public Livro(String nomeLivro, int quantidadePaginas, String autorLivro, String dataLancamentoLivro){
        this.nomeLivro = nomeLivro;
        this.quantidadePaginas = quantidadePaginas;
        this.autorLivro = autorLivro;
        this.dataLancamentoLivro = dataLancamentoLivro;
    }
    
    public Livro(String nomeLivro){
        this.nomeLivro = nomeLivro;
        this.quantidadePaginas = 0;
        this.autorLivro = null;
        this.dataLancamentoLivro = null;
    }
    
    public void getNomeLivro(String nomeLivro){
        this.nomeLivro = nomeLivro;
    }
    
    public String getNomeLivro(){
        return nomeLivro;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public String getDataLancamentoLivro() {
        return dataLancamentoLivro;
    }

    public void setDataLancamentoLivro(String dataLancamentoLivro) {
        this.dataLancamentoLivro = dataLancamentoLivro;
    }
    
    public boolean equals(Livro livros){
        if(this.nomeLivro.equalsIgnoreCase(livros.getNomeLivro())){
            return true;
        }
        return false;
    }
    
    public String exibirLivro(){
        return "Nome do Livro: " + nomeLivro + "\nAutor do Livro: " + autorLivro + "\nQuantidade de paginas:" + quantidadePaginas + "\nData de lancamento: " + dataLancamentoLivro;
    }    
}
