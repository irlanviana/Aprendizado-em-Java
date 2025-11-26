package Fundamentos.Conversões;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite o valor do primeiro salário: ");
		String valor1 = in.nextLine().replace(",", ".");
		
		System.out.print("Digite o valor do segundo salário: ");
		String valor2 = in.nextLine().replace(",", ".");
		
		System.out.print("Digite o valor do terceiro salário: ");
		String valor3 = in.nextLine().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double soma = salario1 + salario2 + salario3;
		double media = soma / 3;
		
		System.out.println("O valor dos sálarios é: " + soma);
		System.out.println("Sua média salarial é: " + media);
		
		
		in.close();
	}
	
}
