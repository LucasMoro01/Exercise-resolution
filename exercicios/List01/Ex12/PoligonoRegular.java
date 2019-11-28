public class PoligonoRegular{
    private String nomePoligono = "";
    private int quantidadeLados;
    private double medidaLado;

    public void setNomePoligono(String nomePoligono){
        this.nomePoligono = nomePoligono;
    }
    public String getNomePoligono(){
        return nomePoligono;
    }
    public void setQuantidadeLados(int quantidadeLados){
        this.quantidadeLados = quantidadeLados;
    }
    public int getQuantidadeLados(){
        return quantidadeLados;
    }
    public void setMedidaLado(double medidaLado){
        this.medidaLado = medidaLado;
    }
    public double getMedidaLado(){
        return medidaLado;
    }

    public double perimetroPoligono(){
        double perimetro = (double)quantidadeLados * medidaLado;
        return perimetro;
    }

    public String nomePoligono(){
        switch(quantidadeLados){
            case 3: nomePoligono = "Trilatero";
            break;
            case 4: nomePoligono = "Quadrilatero";
            break;
            case 5: nomePoligono = "Pentalatero";
            break;
            case 6: nomePoligono = "Hexalatero";
            break;
            case 7: nomePoligono = "Heptalatero";
            break;
            case 8: nomePoligono = "Octolatero";
            break;
            case 9: nomePoligono = "Enealatero";
            break;
            case 10: nomePoligono = "Decalatero";
            break;
            default: System.out.println("Quantidade de lados não válida!");
        }
        return nomePoligono;
    }

    public double areaPoligono(){
        double apotema = 0, area = 0;
        switch(quantidadeLados){
            case 3:
                apotema = (medidaLado / 2.0) / 1.732;
                area = (perimetroPoligono() * apotema) / 2.0; 
            break;
            case 4:
                apotema = (medidaLado / 2.0) / 1.0;
                area = (perimetroPoligono() * apotema) / 2.0;
            break;
            case 5:
                apotema = (medidaLado / 2.0) / 0.726;
                area = (perimetroPoligono() * apotema) / 2.0;
            break;
            case 6:
                apotema = (medidaLado / 2.0) / 0.577;
                area = (perimetroPoligono() * apotema) / 2.0;
            break;
            case 7:
                apotema = (medidaLado / 2.0) / 0.466;
                area = (perimetroPoligono() * apotema) / 2.0;
            break;
            case 8:
                apotema = (medidaLado / 2.0) / 0.404;
                area = (perimetroPoligono() * apotema) / 2.0;
            break;
            case 9:
                apotema = (medidaLado / 2.0) / 0.364;
                area = (perimetroPoligono() * apotema) / 2.0;
            break;
            case 10:
                apotema = (medidaLado / 2.0) / 0.324;
                area = (perimetroPoligono() * apotema) / 2.0;
            break;
        }
        return area;
    }


}
