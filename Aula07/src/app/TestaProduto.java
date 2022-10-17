package app;

import java.util.Scanner;

import entities.Produto;

public class TestaProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto p1 = new Produto("Depilador facial", 129.90, 0);
		Produto p2 = new Produto("Forceps Caseiro de Barro", 1.50, 1000); 
		Produto p3 = new Produto("Faca Tramontina", 50.0, 20, 50);
		
		Scanner sc = new Scanner(System.in);
		
		p1.adicionarEstoque(sc.nextInt());
		p1.adicionarEstoque(150);
		p1.reduzirEstoque(20);
		System.out.println("A quantidade do estoque é " + p1.getEstoque());

		
		


	}

}
