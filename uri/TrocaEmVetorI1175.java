import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int [] array = new int [20];
        int aux;

        for( int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }

        for (int i = 0; i < array.length/2; i++){
            aux = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = aux;
        }
        for (int i = 0; i < array.length; i++){
            System.out.println("N[" + i + "] = " + array[i] );
        }
        scan.close();
 
    }
 
}