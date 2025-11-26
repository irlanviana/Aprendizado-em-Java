package Fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Olá Mundo".charAt(5)); //interage com o índice da string
	
		String s = "Boa tarde"; // O valor inicial da String é imutável
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Irlan";
		var sobrenome = "Viana";
		var idade = 21;
		var salario = 6_725.00;
		
		System.out.println("Nome: " + nome + "\nSobrenome: "
				+ sobrenome + "\nIdade: " + idade +
				"\nSalário: " + "R$" + salario + "\n\n");
	
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome,
				sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.", nome,
				sobrenome, idade, salario);
		
		System.out.println(frase);
		
		System.out.println("Irlan Viana de Souza".toLowerCase().contains("souza"));
		System.out.println("Irlan Viana de Souza".indexOf("Viana"));
		System.out.println("Irlan Viana de Souza".substring(6));
		System.out.println("Irlan Viana de Souza".substring(1, 7));
	
	}

}
