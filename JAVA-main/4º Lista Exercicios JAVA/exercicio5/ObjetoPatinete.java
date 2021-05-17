package exercicio5;

public class ObjetoPatinete {

	public static void main(String[] args) {

		Patinete pesquisa = new Patinete();
		
		pesquisa.setPreco(500);
		pesquisa.setTamanho("G");
		pesquisa.setCor("Prata");
		pesquisa.setDobravel("Sim");
		
		System.out.println("O preço desse patinete é: " + pesquisa.getPreco() + " reais");
		System.out.println("O tamanho é: " + pesquisa.getTamanho());
		System.out.println("A cor é: " + pesquisa.getCor());
		System.out.println("Ele é dobravel? " + pesquisa.getDobravel());
	}

}
