import java.util.Scanner;

public class SomaSimples1003 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a, b, soma = 0;
        a = scan.nextInt();
        b = scan.nextInt();

        soma = a + b;
        System.out.println("SOMA = " + soma);
        scan.close();
    }
}