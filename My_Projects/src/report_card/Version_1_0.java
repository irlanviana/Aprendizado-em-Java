package report_card;

import java.util.Scanner;

public class Version_1_0 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int l, c;
		String [][] nome = new String[5][1];
		double [][] notas = new double[5][5];
		double soma, media;

		for (l = 1; l < 5; l++) {

			System.out.print("Digite o nome do " + l + "º " + "aluno: ");
			nome[l][0] = in.next();

			soma = 0;

			for (c = 1; c < 5; c++) {

				System.out.print("Digite a nota do aluno(a) " + nome[l][0] + " referente ao " + c + "º " + "bimestre: ");
				String recebeNotas = in.next().replace(",", ".");
				notas[l][c] = Double.parseDouble(recebeNotas);
				
				soma = soma + notas[l][c];
		
			}
			
			media = soma/4;
			
			System.out.println("\nA média do aluno " + nome[l][0] + " é: " + String.format("%.2f", media) + "\n");

		}






		in.close();

	}

}
