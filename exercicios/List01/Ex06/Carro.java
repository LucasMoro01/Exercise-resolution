
public class Carro {
	private String marca;
	private String modelo;
	private long codigoChassi;
	public boolean carroLigado = false;
	public boolean carroDesligado = true;
	private float velocidadeAtual;
	
	public Carro(String marca, String modelo, long codigoChassi) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.codigoChassi = codigoChassi;
	}
	
	public void carroLigado() {
		if (this.carroDesligado) {
			this.carroLigado = true;
			this.carroDesligado = false;
		}else
			System.out.println("Carro ja esta ligado");
	}
	
	public void carroDesligado() {
		if (this.carroLigado) {
			this.carroDesligado = true;
			this.carroLigado = false;
		}else
			System.out.println("Carro ja esta desligado");
	}
	
	public void acelerar(float novaVelocidade) {
		if (carroLigado && novaVelocidade > velocidadeAtual && novaVelocidade < 150) {
			this.velocidadeAtual = novaVelocidade;
		}else
			System.out.println("Impossivel acelerar o carro pois ira passar do limite");
	}
	
	public void reduzir(float novaVelocidade) {
		if (carroLigado && novaVelocidade < velocidadeAtual && novaVelocidade > 0) {
			this.velocidadeAtual = novaVelocidade;
		}else
			System.out.println("IMpossivel reduzir a velocidade");
	}
	
	public void informacoes() {
		System.out.println(this.getVelocidadeAtual());
		System.out.println(this.getMarca());
		System.out.println(this.getCodigoChassi());
		System.out.println(this.getModelo());
		System.out.println("Ligado: " + this.carroLigado);
		System.out.println("Desligado: " + this.carroDesligado);
	}
		
	public String getModelo() {
		return modelo;
	}
	public String getMarca() {
		return marca;
	}
	public long getCodigoChassi() {
		return codigoChassi;
	}

	public float getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(float velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	
}
