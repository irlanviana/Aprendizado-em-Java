package Fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5; //declaração e inicialização
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Irlan";
		System.out.println(c);
		
		double d; // variável declarada
		d = 123.56546; //variável inicializada
		System.out.println(d);
		
		/**
		 * Para inferir a variável o var
		 * Não pode ser somente declarado
		 * É preciso declarar e inicializar
		 * Pois a inferencia entende o tipo da variável
		 * Mas somente após delcaração e inicialização
		 */
		
		/** Forma errada de declarar
		* 
		* var e;
		* e = "Victoria";
		* System.out.println(e);
		*/

}
	
}