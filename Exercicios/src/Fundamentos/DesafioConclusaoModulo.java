package Fundamentos;

import java.util.Scanner;

public class DesafioConclusaoModulo {
	
	public static void main(String[] args) {
		
		//Calculadora com Operadores Ternários
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Informe o número: ");
		double num1 = in.nextDouble();
		
		System.out.print("Informe o número: ");
		double num2 = in.nextDouble();
		
		System.out.print("Qual operação deseja realizar? (+, -, *, /, %): ");
		String op = in.next();
		
		 //Lógica - Utilizando Operadores Ternários
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f",
				num1, op, num2, resultado);
		
		in.close();		
	}

}
