package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Informe o dia da semana: ");
		String dia = in.next();

		if (dia.equalsIgnoreCase("Domingo")) {
			System.out.println("Esse é o 1º dia da semana");
		} else if (dia.equalsIgnoreCase("Segunda")) {
			System.out.println("Esse é o 2º dia da semana");
		} else if ("Terça".equalsIgnoreCase(dia) || "Terca".equalsIgnoreCase(dia)) {
			System.out.println("Esse é o 3º dia da semana");
		} else if (dia.equalsIgnoreCase("Quarta")) {
			System.out.println("Esse é o 4º dia da semana");
		} else if (dia.equalsIgnoreCase("Quinta")) {
			System.out.println("Esse é o 5º dia da semana");
		} else if (dia.equalsIgnoreCase("Sexta")) {
			System.out.println("Esse é o 6º dia da semana");
		} else if ("Sábado".equalsIgnoreCase(dia) || "Sabado".equalsIgnoreCase(dia)) {
			System.out.println("Esse é o 7º dia da semana");
		} else {
			System.out.println("O dia informado é inválido");
		}

		in.close();

	}

}
