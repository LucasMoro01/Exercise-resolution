import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        double [] array = new double [100];
        double value;


        value = scan.nextDouble();
        array[0] = value;

        System.out.printf("N[0] = %.4f\n", array[0]);

        for (int j = 1; j < array.length; j++){
            array[j] = value / 2;
            value = array[j];
            System.out.printf("N[%d] = %.4f\n", j, array[j]);
        }
        scan.close();
    }

}
