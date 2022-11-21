package app;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		metodofinal();
	}
	
	public static void metodofinal() {
		metodo1();
	}
	
	public static void metodo1() {
		Scanner sc = new Scanner(System.in);
		try {
			String[] nomes = sc.nextLine().split(" ");
			
			System.out.println("O nome é: " + nomes[2]);
		} catch (Exception e) {
			e.printStackTrace();
			sc.next();
		}
		
		
	}

}
