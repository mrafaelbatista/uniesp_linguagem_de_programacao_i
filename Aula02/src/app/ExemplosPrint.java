package app;

import java.util.Locale;

public class ExemplosPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * Na ferramenta Eclipse, para iniciar uma linha
		 * de código utilizada para imprimir um resultado
		 * devemos utilizar a abreviação "syso"
		 * 
		 * Veja abaixo o println e o printf
		 *  
		 */
		
		// Impressão com quebra de linha
		System.out.println("println() - Aqui estamos imprimindo e pulando uma linha.");
		
		// Impressão sem quebra de linha
		System.out.print("print() - Neste caso não pulamos uma linha.");
		System.out.print("print() - Novo print para seua visualização.");
		
		System.out.println();
		
		// Uma impressão formatada
		double a = 3.1444444;
		System.out.printf("Essa é uma impressão formatada: %.2f%n", a);
		
		// Você pode utilizar a configuração de localização também
		Locale.setDefault(Locale.US);
		System.out.printf("Essa é uma impressão formatada - Locale US: %.2f%n", a);

	}

}
