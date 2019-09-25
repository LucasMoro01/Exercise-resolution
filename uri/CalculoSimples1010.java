import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a, b, d, e;
        float c, f, soma;

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextFloat();
        d = scan.nextInt();
        e = scan.nextInt();
        f = scan.nextFloat();

        soma = (b * c) + (e * f);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", soma);
        scan.close();
    }
}