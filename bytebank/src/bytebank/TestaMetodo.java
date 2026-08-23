package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaDoAndre = new Conta();
		contaDoAndre.saldo = 100;
		contaDoAndre.deposita(50.0);
		System.out.println(contaDoAndre.saldo);
		
	}

}
