import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int value;
		value = scan.nextInt();
		int [] array = new int[value];

		for ( int i = 0; i < array.length; i++){
			array[i] = scan.nextInt();
		}
		
		Arrays.sort(array);

		int aux = array[0], aux1 = 1;
		for (int i = 1; i < array.length; i++){
			if (array[i] != aux) {
				System.out.printf("%d aparece %d vez(es)\n", aux, aux1);
				aux = array[i];
				aux1 = 1;
			}else
				aux1++;
		}
		System.out.printf("%d aparece %d vez(es)\n", aux, aux1);
	}	
}
