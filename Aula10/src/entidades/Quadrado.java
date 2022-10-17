package entidades;

public final class Quadrado extends Forma {
	
	private double base;
	private double altura;
	
	public Quadrado() {
		
	}

	public Quadrado(Color color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		return this.base * this.altura;
	}
	
	
	

}
