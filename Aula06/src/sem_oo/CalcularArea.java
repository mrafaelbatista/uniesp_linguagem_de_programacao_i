package sem_oo;

import java.util.Locale;
import java.util.Scanner;

public class CalcularArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* Definir as variáveis */
		double aX, bX, cX;
		double aY, bY, cY;
		
		/* Receber valores pelo sc.nextDouble() para X */
		System.out.println("Digite o tamanho dos lados do triângulo X");
		aX = sc.nextDouble();
		bX = sc.nextDouble();
		cX = sc.nextDouble();
				
		/* Receber valores pelo sc.nextDouble() para Y */
		System.out.println("Digite o tamanho dos lados do triângulo Y");
		aY = sc.nextDouble();
		bY = sc.nextDouble();
		cY = sc.nextDouble();
		
		/* Calcular o valor de P de X*/
		double pX = (aX + bX+ cX) / 2;
		
		/* Calcular a ÁREA de X */
		double areaX = Math.sqrt(pX * (pX - aX) * (pX - bX) * (pX - cX));
		
		/* Calcular o valor de P de Y*/
		double pY = (aY + bY+ cY) / 2;
		
		/* Calcular a ÁREA de Y */
		double areaY = Math.sqrt(pY * (pY - aY) * (pY - bY) * (pY - cY));
		
		/* Imprimir as áreas dos triângulos */
		System.out.printf("A área do triângulo X é: %.4f%n", areaX);
		System.out.printf("A área do triângulo Y é: %.4f%n", areaY);
		
		/* If para verificar qual é maior */
		
		if (areaX > areaY) {
			System.out.println("A maior área é de X");
		} else {
			System.out.println("A maior área é de Y");
		}		
		
		sc.close();

	}

}
