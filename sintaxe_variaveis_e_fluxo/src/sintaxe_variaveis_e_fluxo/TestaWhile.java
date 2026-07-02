package sintaxe_variaveis_e_fluxo;

public class TestaWhile {
	public static void main(String[] args) {
		
		System.out.println("===== Aula 10 - Testando a estrutura de repetição While =====");
		
		int contador = 0;
		
		while(contador <= 10) {
			System.out.println(contador);
			// contador = contador + 1;
			// contador += 1;
			contador ++;
		}
		// vai mostrar 11 que foi o valor que o contador parou e não entrou no while por ser maior que 10.
		System.out.println(contador);
	}
}
