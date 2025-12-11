package calculatorArithmetic;

import java.util.Scanner;

public class Version_1_2 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("-------- Calculadora Aritmética --------");
		System.out.println();

		String op = "";

		while (!op.equalsIgnoreCase("sair") && !op.equals("0")) {
			
			System.out.print("\nDigite um número: ");
			double num1 = in.nextDouble();

			System.out.print("Digite outro número: ");
			double num2 = in.nextDouble();
			
			double soma = num1 + num2;
			double sub = num1 - num2;
			double multi = num1 * num2;
			double div = num1 / num2;
			double modulo = num1 % num2;
			double expo = Math.pow(num1, num2);

			System.out.print("\nQual operação deseja realizar agora? (+, -, *, /, %, ^): ");
			System.out.print(
					"\nCaso escolha exponenciação -> ^, o primeiro número informado" + " será elevado pelo segundo): \n");
			System.out.println("\nDigite 'sair' ou 0 para encerrar o programa\n");
			op = in.next();
			System.out.println();

			switch (op) {
			case "+" -> {

				System.out.println("Você escolheu Adição.");
				System.out.print("O resultado da operação é: " + soma + "\n");
				System.out.println("----------------------------------------------");
			}
			case "-" -> {

				System.out.println("Você escolheu Subtração.");
				System.out.print("O resultado da operação é: " + sub + "\n");
				System.out.println("----------------------------------------------");
			}
			case "*" -> {

				System.out.println("Você escolheu Multiplicação.");
				System.out.print("O resultado da operação é: " + multi + "\n");
				System.out.println("----------------------------------------------");
			}
			case "/" -> {

				System.out.println("Você escolheu Divisão.");
				System.out.printf("O resultado da operação é: " + div + "\n");
				System.out.println("----------------------------------------------");
			}
			case "%" -> {

				System.out.println("Você escolheu Função Modular.");
				System.out.print("O resultado da operação é: " + modulo + "\n");
				System.out.println("----------------------------------------------");
			}
			case "^" -> {

				System.out.println("Você escolheu Exponenciação.");
				System.out.print("O resultado da operação é: " + expo + "\n");
				System.out.println("----------------------------------------------");
			}
			default -> {
			    if (op.equalsIgnoreCase("sair") || op.equals("0")) {
			        System.out.println("Fechando calculadora...");
			    } else {
			        System.out.println("Opção inválida! Tente novamente.\n");
			    }
			}

			}
		}

		System.out.println("------------------------------------------------");
		System.out.println();

		in.close();

	}
}
