package example;

import java.util.Scanner;

public class TestaContaLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// Instanciando um objeto do tipo ContaLogin
		ContaLogin cl = new ContaLogin();
		
		// Exibir o valor inicial do objeto
		System.out.printf("O nome inicial é: %s%n", cl.getNome());
		
		// Informando um nome com o Scanner
		System.out.print("Digite o seu nome: ");
		String nome = sc.nextLine();
		
		// Passando o valor do nome para o objeto
		cl.setNome(nome);
		
		// Imprimindo o novo valor 
		System.out.printf("O novo nome é: %s%n", cl.getNome());
		
		sc.close();
		

	}

}
