package app;

import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner Object
		Scanner input = new Scanner(System.in);

		// Scanner
		System.out.print("Digite o primeiro número: ");
		int number1 = input.nextInt();
		System.out.print("Digite o segundo número: ");
		int number2 = input.nextInt();

		// Printing of result
		System.out.println("A soma dos valores é: " + (number1 + number2));

		input.close();

	}

}
