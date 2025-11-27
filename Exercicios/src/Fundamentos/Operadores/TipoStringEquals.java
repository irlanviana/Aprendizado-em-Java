package Fundamentos.Operadores;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));
		
		Scanner sc = new Scanner(System.in);
		
		String s2 = sc.next(); // .next() já remove os espaços em branco
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim())); // .trim remove os espaços em branco
		
		
		sc.close();
		
		
	}

}
