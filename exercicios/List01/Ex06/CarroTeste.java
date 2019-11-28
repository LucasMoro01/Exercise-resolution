
public class CarroTeste {

	public static void main(String[] args) {
		Carro carro = new Carro("Chevrolet", "Croma", 215589);
		
		carro.carroLigado();
		carro.setVelocidadeAtual(50f);
			carro.acelerar(130);
		carro.reduzir(40);
		
		carro.informacoes();

	}

}
