package sintaxe_variaveis_e_fluxo;

public class TestaSomatoria {
	public static void main(String[] args) {
		
		int contador = 0;
		int total = 0;
		
		while(contador <= 10) {
			total += contador;
			System.out.println("contador na iteração: " + contador);
			System.out.println("total na iteração: " + total);
			System.out.println("somatório parcial: " + total + " + " + contador + " é igual a " + total);
			contador++;
		}
		System.out.println("total no final de todas as iterações: " + total);
	}
}
