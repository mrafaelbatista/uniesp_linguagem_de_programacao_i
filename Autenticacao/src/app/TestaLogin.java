package app;

public class TestaLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Login l1 = new Login();
		Login l2 = new Login();
		
		l1.setNome("Sandro");
		l1.setLogin("SrJr");
		l1.setSenha("Vasco");

		l2.setNome("Milena");
		l2.setLogin("MilenaR");
		l2.setSenha("23456");
		
		l1.autenticaLogin("Messias", "asdfghjk");
		l2.autenticaLogin("MilenaR", "23456");
		
	}

}
