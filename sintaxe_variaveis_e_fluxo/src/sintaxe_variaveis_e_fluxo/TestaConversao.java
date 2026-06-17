package sintaxe_variaveis_e_fluxo;

public class TestaConversao {
	
	public static void main(String[] args) {
		
		double salario = 1621.57;
		
		// fazendo o casting para converter em um inteiro
		int valor = (int) salario;
		System.out.println("valor convertido para inteiro através do casting: " + valor);
		
		long numeroGrande = 32432423523L;
		short valorPequeno = 2131;
		byte b = 127;
		
		System.out.println(numeroGrande);
		System.out.println(valorPequeno);
		System.out.println(b);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);
		
		float pi = 3.14f;
		System.out.println(pi);
		
	}

}
