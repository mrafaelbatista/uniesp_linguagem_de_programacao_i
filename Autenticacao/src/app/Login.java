package app;

public class Login {

	private String nome;
	private String login;
	private String senha;
	
	public void autenticaLogin(String login, String senha) {
		
		if (this.login.equals(login) && this.senha.equals(senha)) {
			
			System.out.println("Autenticado");
		} else {
			System.out.println("Não autenticado!");
		}
		
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
