import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);


		int n, tamanho, posicao;
		long valueF = 0;

		
		long [] array = new long[61];
		array[0] = 0;
		array[1] = 1;
		array[2] = 1;

		for (int i = 3; i < array.length; i++){
			array[i] = array[i-1] + array[i - 2]; 
		}

		tamanho = scan.nextInt();
		for (int i = 0; i < tamanho; i++){
			posicao = scan.nextInt();
			valueF = array[posicao];
			System.out.println("Fib(" + posicao + ") = " + valueF);

		}
 
    }
 
}