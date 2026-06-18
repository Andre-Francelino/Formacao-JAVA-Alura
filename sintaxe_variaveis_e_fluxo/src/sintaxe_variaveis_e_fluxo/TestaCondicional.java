package sintaxe_variaveis_e_fluxo;

public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("===== Aula 7: Testando Condicionais =====");

		int idade = 17;
		
		int quantidadePessoas = 1;

		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos.");
			System.out.println("Seja bem vindo");
		} else if(quantidadePessoas >=2) {
			System.out.println("Você não tem 18 anos, mas pode entrar, pois está acompanhado.");
			
		} else {
			System.out.println("Você tem menos de 18 anos e não está acompanhado.");
			System.out.println("Infelizmente você não pode entrar");
		}
			
	}

}
