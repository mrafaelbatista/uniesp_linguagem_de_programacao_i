package entities;

public class Pet {
	
	private Integer id;
	private String nome;
	private Integer anoNascimento;
	
	//	Método construtor vazio
	public Pet() {
		
	}
	
	// Método construtor com atributos
	public Pet(Integer id, String nome, Integer anoNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.anoNascimento = anoNascimento;
	}

	// Início dos métodos Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(Integer anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	// Método toString
	@Override
	public String toString() {
		return "Pet [id=" + id + ", nome=" + nome + ", anoNascimento=" + anoNascimento + "]";
	}
	
	

}
