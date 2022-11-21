package app;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException{
		
		Scanner sc = new Scanner(System.in);
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//		System.out.println("Digite a data no formato dd/MM/yyyy:");
		//		Date dt = sdf.parse(sc.next());
		//		
		//		System.out.println("Data formatada: " + sdf.format(dt));
		
//		Date data1 = sdf.parse(sc.next());
//		Date data2 = sdf.parse(sc.next());
//		
//		long diferenca = data1.getTime() - data2.getTime();
//		long dias = TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
//		
//		System.out.println("Quantidade de dias: " + dias);
		
//		String[] linguagens = sc.nextLine().split(" ");
//		System.out.println("Linguagens: " + linguagens[0]);
		try {
			ArrayList<String> linguagens = new ArrayList<String>();
			linguagens.add("Python");
			linguagens.add("Java");
			linguagens.add("Go");
			
			System.out.println("A melhor linguagem é " + linguagens.get(1));
			System.out.println(50 / 0);
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Este é o erro 1: " + e);
		}
		catch (Exception e) {
			System.out.println("O erro foi: " + e);
		}
		
	}

}
