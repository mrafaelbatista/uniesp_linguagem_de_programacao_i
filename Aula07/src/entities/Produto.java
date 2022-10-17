package entities;

public class Produto {
	
	private String nome;
	private double preco;
	private int estoque;
	
	public Produto() {
		
	}
	
	public Produto(String nome) {
		this.nome = nome;
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto(String nome, double preco, int estoque) {
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}
	
	public Produto(String nome, double preco, int estoque, int ano) {
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getEstoque() {
		return estoque;
	}
	
	public void adicionarEstoque(int qtdItens) {
		System.out.printf("Quantidade atual do estoque: %d", this.estoque);
		System.out.println();
		this.estoque += qtdItens;
		System.out.printf("Quantidade adicionada do estoque: %d", this.estoque);
		System.out.println();
	}
	
	public void reduzirEstoque(int qtdItens) {
		System.out.printf("Quantidade atual do estoque: %d", this.estoque);
		System.out.println();
		this.estoque -= qtdItens;
		System.out.printf("Quantidade reduzida do estoque: %d", this.estoque);
		System.out.println();
	}
	
	
	
	
	
	
	
	

}
