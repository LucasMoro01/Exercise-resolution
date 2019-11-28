import java.util.Scanner;
	
//Nome da classe
public class ManipulaVetoresTeste {

    public static void main(String[] args) {
        //Inicializando o Scanner
        Scanner scan = new Scanner(System.in);
        //Criacão de uma variavel para a chamada de métodos
        ManipulaVetores metodos = new ManipulaVetores();
        
        //Declaração de Atributos
        int operacao;
        
        //Pedindo ao Usuario qual operação ele deseja realizar.
        System.out.println("Por gentileza informe a operação desejada:");
        System.out.println("[1] - Somar Vetores");
        System.out.println("[2] - Inverte Vetores");
        operacao = scan.nextInt();
        
        //Condição se o usuário escolher a operação 1 ou 2.
        switch (operacao){
            case 1:
                //Pedindo tamanho do vetor ao Usuário e lendo estes valores.
                System.out.println("Por gentileza, informe o tamanho do vetor 1:");
                int tamVetor1 = scan.nextInt();
                System.out.println("Agora informe o tamanho do vetor 2:");
                int tamVetor2 = scan.nextInt();
                
                //Declaração dos Vetores
                int [] vetor1 = new int [tamVetor1];
                int [] vetor2 = new int [tamVetor2];
                
                //Pedindo valores a serem armazenados nos vetorese lendo e fazendo o preenchimento destes valores.
                System.out.println("Por gentileza informe os valores a serem armazenados no vetor 1:");
                for(int i = 0; i < vetor1.length; i++){
                    vetor1[i] = scan.nextInt();
                }
                System.out.println("Agora informe os valores a serem armazenados no vetor 2:");
                for(int i = 0; i < vetor2.length; i++){
                    vetor2[i] = scan.nextInt();     
                }
                
                //Exibindo na tela o resultado da soma dos valores dos vetores
                System.out.println("A soma dos valores armazenados no vetores é: " + metodos.somaValores(vetor1, vetor2));
  
            case 2:   
                //Pedindo ao usuário para informa tamanho do vetor que será invertido.
                System.out.println("Por gentileza, informe o tamanho do vetor: ");
                int tamVetorInvert = scan.nextInt();
                
                //Declaração do vetor a ser invertido
                String [] vetor = new String [tamVetorInvert];
                
                //Leitura dos valores a serem armazenados no vetor.
                System.out.println("Por gentileza informe os valores a serem armazenados no vetor: ");
                for (int i = 0; i < vetor.length; i++){
                    vetor[i] = scan.next();
                }
            
                //Chama o método inverteVetor para poder exibir o vetor invertido.
                metodos.inverteVetor(vetor);
                
        }
        
         scan.close();
    }
    
}
