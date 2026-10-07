package bytebank_composto;

public class TesteSacaNegativo {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(201));
		System.out.println(conta.getSaldo());
		
		// proibido acessar diretamente pelo atributo
		// conta.saldo = conta.saldo - 201;
		conta.deposita(783.75);
		System.out.println(conta.getSaldo());
		
	}

}
