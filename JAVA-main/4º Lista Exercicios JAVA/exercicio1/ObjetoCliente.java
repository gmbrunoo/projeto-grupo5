package exercicio1;

public class ObjetoCliente {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.nome = "Renan";
		cliente1.idade = 25;
		cliente1.cpf = "43950165886";
		cliente1.endereco = "Rua Xavier Marques";
		
		System.out.println("O nome do cliente é: " + cliente1.nome);
		System.out.println("Idade: " + cliente1.idade);
		System.out.println("Seu CPF é: " + cliente1.cpf);
		System.out.println("Seu endereço é: " + cliente1.endereco);
	}

}
