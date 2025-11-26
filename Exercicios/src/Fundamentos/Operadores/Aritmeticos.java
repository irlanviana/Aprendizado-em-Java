package Fundamentos.Operadores;

public class Aritmeticos {
	
	public static void main(String[] args) {
		
		System.out.println(2 + 5);
		
		var x = 548.95;
		double y = 45.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 10;
		int b = 57;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b); //utilizando CASTING para 
											//converter de int para double
		
		//Resto da divisão "%"
		System.out.println(8 % 3); 
		System.out.println(a % b);
		
		System.out.println(x + y + (a * b));
	}

}
