package aplicacao;

import entidades.Circulo;
import entidades.Color;
import entidades.Forma;
import entidades.Quadrado;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Forma f1 = new Quadrado(Color.BLACK, 3.5, 4.5);
		Forma f2 = new Circulo(Color.BLUE, 5.0);
		
		System.out.println(f1.calcularArea());
		System.out.println(f2.calcularArea());
		

	}

}
