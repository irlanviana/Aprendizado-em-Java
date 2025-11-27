package Fundamentos.Operadores;

public class DesafioOperadoresLogicos {
	
	public static void main(String[] args) {
		
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;

		boolean tv50 = trabalho1 && trabalho2;
		boolean tv32 = trabalho1 ^ trabalho2;
		boolean sorvete = trabalho1 || trabalho2;
		boolean saudavel = !sorvete;
		
		System.out.println("Comprou Tv 50\" ? " + tv50);
		System.out.println("Comprou Tv 32\" ? " + tv32);
		System.out.println("Comprou Tv 32\" Sorvete ? " + saudavel);
		
	}

}
