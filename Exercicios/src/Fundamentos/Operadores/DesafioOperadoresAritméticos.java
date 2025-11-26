package Fundamentos.Operadores;

public class DesafioOperadoresAritméticos {
	
	public static void main(String[] args) {
		
		double expressao1 = 6 * (3 + 2);
		double expo1 = Math.pow(expressao1, 2);
		double resultado1 = expo1 / (3 * 2);
		
		double expressao2 = (1 - 5) * (2 - 7) / 2;
		double expo2 = Math.pow(expressao2, 2);
		double resultado2 = expo2;
		
		double sub = resultado1 - resultado2;
		double expo3 = Math.pow(sub, 3);
		
		double divTotal = Math.pow(10, 3);
		
		double resultadoFinal = expo3 / divTotal;
		System.out.println(resultadoFinal);
		
	}

}
