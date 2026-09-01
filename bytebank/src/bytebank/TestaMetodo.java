package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaDoAndre = new Conta();
		
		contaDoAndre.saldo = 100;
		contaDoAndre.deposita(50.0);
		System.out.println(contaDoAndre.saldo);
		
		boolean conseguiuRetirar = contaDoAndre.saca(45.5);
		System.out.println(contaDoAndre.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaKaren = new Conta();
		contaDaKaren.deposita(1000);
		
		System.out.println(contaDaKaren.saldo);
		
		if(contaDaKaren.transfere(300, contaDoAndre)) {
			System.out.println("Transferência realizada com sucesso!");
		} else {
			System.out.println("Faltou dinheiro!");
		}
		
		System.out.println(contaDaKaren.saldo);
		System.out.println(contaDoAndre.saldo);
		
	}

}
