package interfaceEx2;

public class Cachorro implements Animal{
	@Override
	public void nome() {
		System.out.println("O nome do cachorro é: Slinck");
	}
	@Override
	public void idade() {
		System.out.println("Tem " + 2 + " anos");
	}
	@Override
	public void som() {
		System.out.println("O som é: auauau...");
	}
	public void acao() {
		System.out.println("E ele corre...\n");
	}
}
