package oo;

public class Triangulo {
	
	double a, b, c;
	
	public double calcularP() {
		return ((this.a + this.b+ this.c) / 2);
	}
	
	public double calcularArea() {
		double p = this.calcularP();
		return (Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c)));
	}

}
