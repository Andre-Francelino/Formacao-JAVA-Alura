package bytebank_composto;

public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente andre = new Cliente();
		andre.nome = "André";
		andre.cpf = "777.777.777-77";
		andre.profissao = "Programador";
		
		Conta contaDoAndre = new Conta();
		contaDoAndre.deposita(100);
		
		contaDoAndre.titular = andre;
		System.out.println(contaDoAndre.titular.nome);
		System.out.println(contaDoAndre.titular.cpf);
		System.out.println(contaDoAndre.titular.profissao);
		
		System.out.println(contaDoAndre.titular);
		System.out.println(andre);
		
		System.out.println(contaDoAndre.pegaSaldo());
	}

}
