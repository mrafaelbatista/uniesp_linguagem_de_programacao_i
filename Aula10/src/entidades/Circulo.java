package entidades;

public final class Circulo extends Forma {
	
	private double raio;
	
	public Circulo() {
		
	}

	public Circulo(Color color, double raio) {
		super(color);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		return 3.14 * this.raio * this.raio;
	}
		

}
