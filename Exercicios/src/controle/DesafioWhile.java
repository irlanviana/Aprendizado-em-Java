package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.print("Informe a nota (ou -1 p/ sair): ");
			nota = in.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
			total += nota;
			quantidadeDeNotas++;
			}else if (nota != -1) {
				System.out.println("Informe uma nota válida!");
			}
		}
		
		//Calcular Média
		
		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media);
		
		
		
		
		in.close();
		
	}

}
