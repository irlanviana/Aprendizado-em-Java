package calculator.body_mass_index;

import java.util.Scanner;

public class version_1_0 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("-----------------------------------------------------\n");
		System.out.println("\nVamos fazer o cálculo do seu Índice de Massa Córporea");
		System.out.println("\n-----------------------------------------------------\n");
		
		System.out.print("Digite sua altura (cm): ");
		String cm = in.nextLine().replace(",", ".");
		System.out.print("Digite seu peso (kg): ");
		String kg = in.nextLine().replace(",", ".");
		
		double altura = Double.parseDouble(cm);
		double peso = Double.parseDouble(kg);
		
		double imc = peso / Math.pow(altura, 2);
		
		if (imc <= 18.5) {
			
			System.out.println("Seu IMC é: " + imc);
			System.out.println("Classificação: Abaixo do peso ideal");
			
		}else if (imc > 18.5 && imc < 24.9){
			
			System.out.println("Seu IMC é: " + imc);
			System.out.println("Classificação: Peso ideal.");
			
		}else if (imc > 25 && imc < 29.9){
			
			System.out.println("Seu IMC é: " + imc);
			System.out.println("Classificação: Acima do peso ideal.");
			
		}else if (imc > 30 && imc < 34.9){
			
			System.out.println("Seu IMC é: " + imc);
			System.out.println("Classificação: Obesidade.");
			
		}else if (imc > 35){
			
			System.out.println("Seu IMC é: " + imc);
			System.out.println("Classificação: Obesidade Extrema.");
			
		}else {
			
			System.out.println("Valores poder ter sido informados incorretamente. Verifique-os.");			
			
		}
		
		in.close();
		
	}

}
