package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("primeira conta tem R$ " + primeiraConta.saldo);
		System.out.println("segunda conta tem R$ " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		System.out.println(segundaConta.agencia);
		
		segundaConta.agencia = 146;
		System.out.println("agora a segunda conta está"
				+ " na agência " + segundaConta.agencia+"\n");
		
		
		if(primeiraConta == segundaConta) {
			System.out.println("são iguais, apontam para o mesmo endereço de memória");
		} else {
			System.out.println("são diferentes, não apontam para o mesmo endereço de memória");
		}
		
		System.out.println("endereço de memória da 1ª conta: " + primeiraConta);
		System.out.println("endereço de memória da 2ª conta: " + segundaConta);
		
	}

}
