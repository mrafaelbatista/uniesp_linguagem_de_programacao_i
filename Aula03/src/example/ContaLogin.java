package example;

public class ContaLogin {
	
	private String nome; // Variável de instância
	private String login;
	
	
	// Método construtor
//	public ContaLogin(String nome) {
//		this.nome = nome;
//	}
//	
	/*
	 * Métodos Get e Set são utilizados para acessar
	 * os valores de uma variável. Assim, evitamos, que
	 * o acesso seja realizado diretamente em uma variável.
	 * 
	 * Métodos get() são utilizados para resgatar o valor de uma variável;
	 * 
	 * Métodos set() são utilizados para configurar o valor de uma variável;
	 * 
	 */
	
	// Get e Set de Nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Get e Set de Login
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	
}
