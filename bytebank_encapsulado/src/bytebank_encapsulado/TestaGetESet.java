package bytebank_encapsulado;

public class TestaGetESet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		//conta.numero = 1337; não pode!
		conta.setNumero(1337);
		//System.out.println(conta.numero); não pode!
		System.out.println(conta.getNumero());
		
		conta.deposita(150);
		System.out.println(conta.getSaldo());
		
		conta.setAgencia(270506);
		System.out.println(conta.getAgencia());
		
	}

}
