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
		
		Cliente goku = new Cliente();
		//conta.titular = Goku;
		goku.setNome("Kakarotto Goku");
		
		conta.setTitular(goku);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Guerreiro Z");
		// agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Guerreiro Z");
		
		System.out.println(titularDaConta);
		System.out.println(goku);
		System.out.println(conta.getTitular());
		
	}

}
