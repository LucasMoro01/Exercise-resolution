import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);

		int [] array = new int[100];
		int maior, j =0;

		maior = array[0];
		for (int i = 0; i < array.length; i++){
			array[i] = scan.nextInt();
			if(array[i] > maior){
				maior = array[i];
				j = i + 1;
			}
		}
		System.out.println(maior + "\n" + j);
 
    }
 
}