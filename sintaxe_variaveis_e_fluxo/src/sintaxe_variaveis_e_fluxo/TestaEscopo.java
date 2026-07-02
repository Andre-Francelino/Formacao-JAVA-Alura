package sintaxe_variaveis_e_fluxo;

public class TestaEscopo {
	
	public static void main(String[] args) {
		
		System.out.println("===== Aula 9: Testando Escopo de Variável =====");

		int idade = 27;
		int quantidadePessoas = 5;
		
		// boolean acompanhado = quantidadePessoas >= 2;
		
		boolean acompanhado;
		
		if(quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("você tem " + idade + " anos.");
		System.out.println("você(s) está(ão) em " + quantidadePessoas + " pessoa(s)");
		System.out.println("valor de acompanhado é " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
		
	}

}
