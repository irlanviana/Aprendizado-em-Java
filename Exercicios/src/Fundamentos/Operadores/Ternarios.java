package Fundamentos.Operadores;

public class Ternarios {
	
	public static void main(String[] args) {
		
		double media = 7.6;
		
		// String resultadoParcial = media >= 5.0 ? 
			//	"Em recuperação" : "Reprovado";
		
		String resultadoFinal = media >= 7.0 ? 
				"aprovado" : "em recuperação";
		
		System.out.println("O aluno está " + resultadoFinal);
		
		double nota = 8.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		String resultado = temDesconto ? "Sim" : "Não";
		
		System.out.println("Tem desconto? " + resultado);
		
		
		
	}

}
