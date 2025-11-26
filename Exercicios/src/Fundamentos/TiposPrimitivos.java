package Fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		// Informações do Funcionário
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 900;
		int id = 8765445;
		long pontosAcumulados = 2_134_765_099; // Caso ultrapasse o limite, inserir o L no final
		
		//Tipos numéricos reais
		float salario = 11_564.90f;
		double vendasAcumuladas = 2_987_876_987.90;
		
		//Tipo booleano
		boolean estaDeFerias = false; // true
		
		//Tipo caractere
		char status = 'A'; //ativo  (tabela unicode permitida)
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de viagens
		
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + "R$" + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
