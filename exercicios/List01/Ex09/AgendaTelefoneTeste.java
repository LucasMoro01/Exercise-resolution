import java.util.Scanner;

public class AgendaTelefoneTeste{
    public static void main(String[] args){
        //Inicialização do Scanner.
        Scanner scan = new Scanner(System.in);

        //Variaveis
        int operacao;
        AgendaTelefone agendaTelefone = new AgendaTelefone();
        String nome;
        int ddd;
        int telefone;
        boolean encerrarPrograma = false;
        Contato c;

        //Teste de repetição para continuar a execução do menu ate'o usuário digitar 0.
        do{
            //Menu a ser exibido para o usuário.
            System.out.println("Selecione sua operacao:");
            System.out.println("---------MENU---------");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Imprimir agenda");
            System.out.println("3. Procurar contato"); 
            System.out.println("4. Remover contato");
            System.out.println("0. Sair");
            operacao = scan.nextInt();
            scan.nextLine();

            switch (operacao){
            case 1:// Adicionar contato
                System.out.println("informe o nome:");
                nome = scan.nextLine();
                
                System.out.println("Informe o ddd(XX):");
                ddd = scan.nextInt();

                System.out.println("Informe o telefone:");
                telefone = scan.nextInt();

                c = new Contato(nome, ddd, telefone);
                agendaTelefone.adicionarContato(c);
                System.out.println("");
                break;
            case 2: //Imprimir agenda
                agendaTelefone.imprimirAgenda();
                System.out.println("");
                break;
            case 3://Procurar contato.
                System.out.println("Informe o nome que deseja pesquisar:");
                nome = scan.nextLine();

                agendaTelefone.pesquisarNome(nome);
                System.out.println("");
                break;
            case 4://Remover contato
                System.out.println("Informe o nome do contato que deseja remover");
                nome = scan.nextLine();

                c = new Contato(nome, 0, 0);

                agendaTelefone.removerContato(c);
                System.out.println("");
                break;
            case 0://Encerrar programa
                encerrarPrograma = true;
                break;
            default:
                System.out.println("Operacao invalida!");
                System.out.println("");
            }
        }while(encerrarPrograma == false);//Condição para parar o Do-while.
        //Encerramento do Scanner.
        scan.close();
    }
} 
