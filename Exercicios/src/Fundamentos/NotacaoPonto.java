package Fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X".toUpperCase();
		//s = s.toUpperCase();
		
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Irlan".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Irlan")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos não possuem o operador "."
		int a = 3;
		System.out.println(a);
		
		
	}

}
