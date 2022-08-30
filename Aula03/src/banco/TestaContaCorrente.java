package banco;

public class TestaContaCorrente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaCorrente conta1 = new ContaCorrente();
		
		conta1.setnConta(123456);
		
		System.out.println("Num da conta: " + conta1.getnConta());
		System.out.println("Saldo atual: " + conta1.getSaldo());
		
		conta1.depositar(100.0);
		
		System.out.println("Num da conta: " + conta1.getnConta());
		System.out.println("Saldo atual: " + conta1.getSaldo());
		
		
		ContaCorrente conta2 = new ContaCorrente();
		System.out.println("Saldo atual: " + conta2.getSaldo());
		

	}

}
