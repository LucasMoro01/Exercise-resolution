import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        float [] array = new float [100];

        for (int j = 0; j < array.length; j++){
            array[j] = scan.nextFloat();
        }

        for (int i = 0; i < array.length; i++){
            if (array[i] <= 10){
                System.out.printf("A[%d] = %.1f\n", i, array[i]);
            }
        }

        scan.close();
    }
}
