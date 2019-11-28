import java.util.Scanner;

public class ContaBancoTeste {
    public static void main(String[] args) {
        //Inicializando o Scanner.
        Scanner scan = new Scanner(System.in);
        
        ContaBanco usuario = new ContaBanco();

        //Variáveis
        int operacao;
        double valor;
        String respWhile;

        //Pedindo ao usuário que digite seu nome e CPF, e lendo esses dados.
        System.out.println("Por gentileza informe seu nome:");
        usuario.setNameDono(scan.nextLine());
        System.out.println("Por gentileza informe seu CPF");
        usuario.setCpf(scan.nextLine());
        
        //Teste de repetição para perguntar se o usuário deseja realizar outra operação.
        do{
            System.out.println("Por gentileza informe qual operação deseja realizar:\n[1] - Depositar\n[2] - Sacar\n[3] - Calcular Juros");
            operacao = scan.nextInt();

            //Teste condicional para realizar a operação que o usuário escolheu.
            switch (operacao){
                case 1:
                    System.out.println("Informe o valor que deseja depositar");
                    valor = scan.nextDouble();
                    usuario.depositar(valor);
                break;
                case 2:
                    System.out.println("Informe o valor que deseja retirar");
                    valor = scan.nextDouble();
                    usuario.sacar(valor);
                break;
                case 3:
                    System.out.println("O valor do juros e:" + usuario.taxaJuros());
                    break;
                default:
                    System.out.println("Operação invalida"); 
            }
            usuario.estadoAtual();

            //Perguntando ao usuário se deseja realizar outra operação, se sim entra novamente no teste de repetição.
            System.out.println("Deseja realizar outra operacao? [SIM] [NAO]");
            
            respWhile = scan.next();

        }while(respWhile.equalsIgnoreCase("SIM")); 
        //Encerramento do Scanner.
        scan.close();
        }
        
    }
