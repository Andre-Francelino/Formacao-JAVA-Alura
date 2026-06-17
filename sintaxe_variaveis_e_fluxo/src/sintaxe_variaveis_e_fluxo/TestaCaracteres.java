package sintaxe_variaveis_e_fluxo;

public class TestaCaracteres {
	
	public static void main(String args[]) {
		
		// sempre usar aspas simples no tipo char
		char letraA = 'x';
		System.out.println(letraA);
		
		// o valor 66 em char equivale a letra B na tabela ASCII
		char valor = 66;
		System.out.println(valor);
		
		// para somar o valor + 1 é preciso fazer o casting para o tipo char
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		// no tipo String se usa sempre aspas duplas
		String frase = "Curso de linguagem Java para iniciantes na programação ";
		System.out.println(frase);
		
		// concatenação de Strings
		frase = frase + 2026;
		System.out.println(frase);
		
	}

}
