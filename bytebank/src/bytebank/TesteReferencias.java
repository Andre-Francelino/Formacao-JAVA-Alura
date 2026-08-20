package bytebank;

public class TesteReferencias {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta é " + primeiraConta.saldo);
		
		
		Conta segundaConta = primeiraConta;
		System.out.println("referência da 1ª conta é " + segundaConta);
		
		System.out.println("referência da 2ª conta é " + primeiraConta);
		
		segundaConta.saldo += 100;
		
		System.out.println("Novo saldo na segunda conta é " + segundaConta.saldo);
		System.out.println("Novo saldo na primeira conta é " + primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("são iguais, apontam para o mesmo endereço de memória");
		} else {
			System.out.println("são diferentes");
		}
		
	}

}
