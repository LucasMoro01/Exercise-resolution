
//Nome da Classe
public class ManipulaVetores {
    // Declaração de Atributos.
    public int soma;
    
    // Criação do Método somaValores.
    public int somaValores(int [] vetor1, int []vetor2){
        for(int i = 0; i < vetor1.length; i++){
           soma += vetor1[i];
        }
        for(int j = 0; j < vetor2.length; j++){
           soma += vetor2[j];
        }
    return soma;        
    }
    
    // Criação método de inverteVetor
    public String[] inverteVetor(String[] vetor){
        String aux;
        for(int i = 0; i < vetor.length/2; i++){
            aux = vetor[vetor.length - 1 - i];
            vetor[vetor.length - 1 - i] = vetor[i];
            vetor[i] = aux;
		}
		imprimiVetor(vetor);
    return vetor;
    }
    
    //Criação do método imprimiVetor
    public void imprimiVetor(String[] vetor){
        System.out.println("O vetor invertido é:");
        
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + "\t");
        }
        System.out.println();
                
    }
}
