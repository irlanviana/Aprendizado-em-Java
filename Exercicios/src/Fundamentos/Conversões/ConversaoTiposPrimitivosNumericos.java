package Fundamentos.Conversões;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		double a = 3; //conversao implicita entre parêntese
		System.out.println(a);
		
		float b = (float) 1.4566525848; //conversao explicita entre parêntese (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //conversao explicita entre parêntese (CAST)
		System.out.println(d);
		
		double e = 1.9998765;
		int f = (int) e; //conversao explicita entre parêntese (CAST)
		System.out.println(f);
		
	}
}
