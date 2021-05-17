package exercicio2;

public class TesteSonsAnimais {
	
	public static void main(String[] args) {
		
		Cachorro1 dog = new Cachorro1();
		Cavalo1 fusion = new Cavalo1();
		Preguica1 shot = new Preguica1();
		
		dog.setSomCachorro("AU AU AU AU...");
		
		fusion.setSomCavalo("IIH HII HI...");
		
		shot.setSomPreguica("AAAHHHHH...");
		
		System.out.println("==Som dos Animais==");
		System.out.println("O som do cavalo é: " + fusion.getSomCavalo());
		System.out.println("O som do cachorro é: " + dog.getSomCachorro());
		System.out.println("O som da preguiça é: " + shot.getSomPreguica());
	}

}
