package Fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//byte
		Byte b = 100;
		Short s = 1000;
		//parseInt converte uma string em um inteiro
		//Integer i = Integer.parseInt(entrada.next());
		Integer i = 1000; // int
		Long l = 100000000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		entrada.close();
		
		Float f = 1234.545f;
		System.out.println(f);
		
		Double d = 123455.5566;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c + "...");
		
		//  Para cada versão do Tipo Primitivo
		//  Existe uma versão Orientada a Objetos
		//	Wrappers
		 
	}
}
