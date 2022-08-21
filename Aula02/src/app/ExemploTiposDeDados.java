package app;

public class ExemploTiposDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exemplo de tipos de dados
		int numero = 30; // inteiro
		String nome = "Alberto Roberto"; // String
		double pi = 3.1414; // double
		float pif = 3.14f; // float
		boolean status = true; // boolean

		/*
		 * Imprimindo valores no console com syso (Eclipse) ou sout (Intellij)
		 */
		System.out.println("Número inteiro " + numero);
		System.out.println("String com nome " + nome);
		System.out.println("Double com pi: " + pi);
		System.out.println("Float com pi: " + pif);
		System.out.println("Boolena com status: " + status);

		// Realização de cálculos
		float result, teste; // Criamos dois indicadores de variáveis do tipo float
		
		// Definição de um valor float
		teste = 56.89f;
		
		// Processamento de um cálculo com cast para float
		result = (float) (teste + (numero * 0.1));
		
		// Estrutura de if simples
		if (result > 35) {
			System.out.println(result);
		}

	}

}
