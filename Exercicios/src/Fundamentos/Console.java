package Fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print("dia\n");
		
		System.out.println("Boa");
		System.out.println("tarde");
		
		System.out.printf("Mega Sena: %d %d %d %d %d %d %n",
				25, 37, 64, 58, 45, 55);
		
		System.out.printf("Salário: %.1f%n", 6457.87668);
		System.out.printf("Nome: %s%n", "Irlan");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("Estes são os seus dados: Nome -> %s %s | Idade -> %d",
				nome, sobrenome, idade);

		entrada.close();
	
	}

}
