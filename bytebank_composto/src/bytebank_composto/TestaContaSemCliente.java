package bytebank_composto;

public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		
		Conta contaDaJessica = new Conta();
		System.out.println(contaDaJessica.pegaSaldo());
		
		contaDaJessica.titular = new Cliente();
		System.out.println(contaDaJessica.titular);
		
		contaDaJessica.titular.nome = "Jéssica";
		System.out.println(contaDaJessica.titular.nome);
		
	}

}
