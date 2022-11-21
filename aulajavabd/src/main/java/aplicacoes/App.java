package aplicacoes;

import entities.Pet;

public class App {

	public static void main(String[] args) {
		
		Pet p1 = new Pet(1, "Totó", 1986);
		Pet p2 = new Pet(2, "Toíco", 2005);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());

	}

}
