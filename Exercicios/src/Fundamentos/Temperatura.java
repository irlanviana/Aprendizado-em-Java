package Fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		// (°F - 32) x 5/9 = °C
		
		final int AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		
		double fahr = 56; 
		double conversao = (fahr - AJUSTE) * FATOR;
		
		System.out.println("Hoje está fazendo " + conversao + " °C");
		
		
		
	}

}
