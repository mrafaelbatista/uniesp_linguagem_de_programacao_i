package oo;

import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Para importar bibliotecas CRTL+SHIFT+O */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digite o valor do triângulo X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite o valor do triângulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		System.out.printf("O valor P de X é: %.4f%n", x.calcularP());
		System.out.printf("O valor P de Y é: %.4f%n", y.calcularP());
		
		System.out.printf("O valor da Área de X é: %.4f%n", x.calcularArea());
		System.out.printf("O valor da Área de Y é: %.4f%n", y.calcularArea());
		
		if (x.calcularArea() > y.calcularArea()) {
			System.out.println("X é maior");
		} else {
			System.out.println("Y é maior");
		}
		
		sc.close();
	}

}
