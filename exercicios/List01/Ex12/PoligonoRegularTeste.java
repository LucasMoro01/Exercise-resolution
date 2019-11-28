import java.util.Scanner;

public class PoligonoRegularTeste {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        PoligonoRegular poligono = new PoligonoRegular();

        System.out.println("Por gentileza informe a quantidade de lados do poligono:");
        poligono.setQuantidadeLados(scan.nextInt());
        scan.nextLine();

        System.out.println("Informe a medida do lado do poligono(centimetros):");
        poligono.setMedidaLado(scan.nextDouble());
        
        System.out.println("Nome do poligono: " + poligono.nomePoligono());
        System.out.println("Perimêtro: " + poligono.perimetroPoligono());
        System.out.printf("Area: %.3f cm^2\n", poligono.areaPoligono());

    }
}
