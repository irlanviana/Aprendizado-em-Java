package Fundamentos.Operadores;

public class Relacionais {
	
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		System.out.println(7 != 90);
		System.out.println(7 > 90);
		System.out.println(789 >= 90);
		System.out.println(7 < 45);
		System.out.println(7 <= 90);

		
		double nota = 8.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
		
		
		
		
	}

}
