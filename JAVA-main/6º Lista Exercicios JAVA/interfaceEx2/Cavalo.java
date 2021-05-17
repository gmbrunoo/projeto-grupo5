package interfaceEx2;

public class Cavalo implements Animal {
	@Override
	public void nome() {
		System.out.println("O nome do cavalo é: Buster");
	}
	@Override
	public void idade() {
		System.out.println("Tem " + 4 + " anos");
	}
	@Override
	public void som() {
		System.out.println("O som é: ihh hihihih");
	}
	void acao() {
		System.out.println("E ele corre...\n");
	}
}
