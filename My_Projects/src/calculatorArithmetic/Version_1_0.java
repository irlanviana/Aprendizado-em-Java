package calculatorArithmetic;

import java.util.Scanner;

public class Version_1_0 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num1 = in.nextDouble();

        System.out.print("Digite outro número: ");
        double num2 = in.nextDouble();

        double soma = num1 + num2;
        double sub = num1 - num2;
        double multi = num1 * num2;
        double div = num1 / num2;

        System.out.print("\nQual operação deseja realizar? (+, -, * ou /): ");
        String op = in.next();
        System.out.println();

        switch (op) {
            case "+" -> {

                System.out.println("Você escolheu Adição.");
                System.out.print("O resultado da operação é: " + soma);
            }
            case "-" -> {

                System.out.println("Você escolheu Subtração.");
                System.out.print("O resultado da operação é: " + sub);
            }
            case "*" -> {

                System.out.println("Você escolheu Multiplicação.");
                System.out.print("O resultado da operação é: " + multi);
            }
            case "/" -> {

                System.out.println("Você escolheu Divisão.");
                System.out.print("O resultado da operação é: " + div);
            }
            default -> {
                System.out.println("Nenhuma operação foi escolhida.");
                System.out.println("Fechando Calculadora 1.0...");
                System.exit(0);
            }
        }

        in.close();

    }
}
