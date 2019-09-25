import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        
		int n, posicao = 0;
		n = scan.nextInt();
		int [] array = new int[n];
		
		for ( int i = 0; i < array.length; i++){
			array[i] = scan.nextInt();
		}

		int menor = array[0];
		
		for ( int i = 1; i < array.length; i ++){
			if (array[i] < menor){
				menor = array[i];
				posicao = i;
			}
		}

		System.out.println("Menor valor: " + menor);
		System.out.println("Posicao: " + posicao);
 
    }
 
}