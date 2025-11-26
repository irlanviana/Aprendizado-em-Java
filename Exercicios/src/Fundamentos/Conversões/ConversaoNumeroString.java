package Fundamentos.Conversões;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		
		Integer num1 = 1000;
		System.out.println(num1.toString().length());
		
		int num2 = 10000;
		System.out.println(Integer.toString(num2).length()); //conversão chamando o Integer
		
		System.out.println(("" + num1).length()); //conversão com string vazia
		System.out.println(("" + num2).length()); //conversão com string vazia
	}

}
