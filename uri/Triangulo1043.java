import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float a, b, c, perimetro = 0, area = 0;

        a = scan.nextFloat();
        b = scan.nextFloat();
        c = scan.nextFloat();

        if (a >= b + c || b >= c + a || c >= b + a) {
            area = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f\n", area);
        } else {
            perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        }

        scan.close();
    }
}
