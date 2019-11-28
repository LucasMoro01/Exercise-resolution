package ex07;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class BibliotecaTeste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int operacao;
        String nomeLivro, autorLivro, dataLancamentoLivro;
        int quantidadePaginas;
        boolean encerrarPrograma = false;
        Livro l;
        
        do{
        System.out.println("Olá, por gentileza informe o que deseja realizar: ");
        System.out.println("[1] - Consultar Livro\n[2] - Adicionar Livro\n[3] - Remover Livro\n[4] - Imprimir acervo completo\n[0] - Sair");
        operacao = scan.nextInt();
        scan.nextLine();
        
        switch(operacao){
        case 1:
            System.out.println("Por gentileza, informe o nome do livro: ");
            nomeLivro = scan.nextLine();
            System.out.println("");
            biblioteca.pesquisarLivro(nomeLivro);
            System.out.println("");
        break;
        case 2:
            System.out.println("Informe o nome do livro:");
            nomeLivro = scan.nextLine();
            System.out.println("Informe a quantidade de paginas do livro:");
            quantidadePaginas = scan.nextInt();
            scan.nextLine();
            System.out.println("Informe o autor do livro:");
            autorLivro = scan.nextLine();
            System.out.println("Informe a data de lancamento do livro:");
            dataLancamentoLivro = scan.nextLine();
            
            l = new Livro(nomeLivro, quantidadePaginas, autorLivro, dataLancamentoLivro);
            biblioteca.adicionarLivro(l);
            System.out.println("");
        break;
        case 3:
            System.out.println("Informe o nome do livro:");
            nomeLivro = scan.nextLine();
            /*System.out.println("Informe o autor do livro");
            autorLivro = scan.nextLine();
            System.out.println("Informe a data de lancamento do livro");
            dataLancamentoLivro = scan.nextLine();
            int confirmacao;
            System.out.println("Certeza que deseja remover o livro " + nomeLivro + "?\n[1] - SIM\n[2] - Cancelar");
            confirmacao = scan.nextInt();
            if (confirmacao == 1){*/
                l = new Livro(nomeLivro, 0, null, null);
                biblioteca.removerLivro(l);
                System.out.println("");
            //}
        break;
        case 4:
            biblioteca.ImprimirAcervo();
            System.out.println("");
        break;
        case 0:
            encerrarPrograma = true;
        break;
        default:
                System.out.println("Operacao invalida!");
                System.out.println("");
        }
        
        }while(encerrarPrograma == false); //Condição para parar o Do-While
        
        scan.close();
    }
}
