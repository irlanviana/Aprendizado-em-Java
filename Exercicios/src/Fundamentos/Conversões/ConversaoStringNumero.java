package Fundamentos.Conversões;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog( //mostra uma tela interativa
				"Digite o primeiro número: ");		// para o usuário digitar
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo número: ");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1); //converte string para double
		double numero2 = Double.parseDouble(valor2); //converte string para double
		
		double soma = numero1 + numero2;
		
		System.out.println("A Soma é: " + soma);
		System.out.println("A Média é: " + soma/2);
		

	}

}
