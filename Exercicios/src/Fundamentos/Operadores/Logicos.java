package Fundamentos.Operadores;

public class Logicos {
	
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); // Tabela Verdade: E/AND
		System.out.println(condicao1 || condicao2); // Tabela Verdade: OU/OR
		System.out.println(condicao1 ^ condicao2); // Tabela Verdade: XOR
		System.out.println(!condicao1); // Tabela Verdade: Not
		System.out.println(!condicao2); // Tabela Verdade: Not
		
		System.out.println("\nTabela Verdade E(AND)\n");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true);
		//System.out.println(false && false);
		
		System.out.println("\nTabela Verdade OU(OR)\n");
		//System.out.println(true || true);
		//System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela Verdade OU Exclusivo (XOR)\n");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTabela Verdade NOT(NÃO)\n");
		System.out.println(!true);
		System.out.println(!false);
		
	}

}
