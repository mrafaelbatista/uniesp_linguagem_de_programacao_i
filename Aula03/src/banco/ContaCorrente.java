package banco;

public class ContaCorrente {
	
	private int nConta;
	private double saldo;
	
	
	public void sacar(double valorSaque) {
		
		if (valorSaque <= saldo) {
			saldo = saldo - valorSaque;
		} else {
			System.out.println("Você não tem saldo suficiente!");
		}
		
	}
	
	
	public void depositar(double valorDeposito) {
		
		if (valorDeposito > 0) {
		saldo = saldo + valorDeposito;
		} else {
			System.out.println("Valores precisam ser maior que zero!");
		}
	}
	
	
	public int getnConta() {
		return nConta;
	}
	
	public void setnConta(int nConta) {
		this.nConta = nConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	

}
