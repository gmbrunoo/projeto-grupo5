package interfaceEx2;

public class Preguica implements Animal{
	@Override
	public void nome() {
		System.out.println("Nome da preguiça: Pink");
	}
	@Override
	public void idade() {
		System.out.println("tem " + 25 + " anos");
	}
	@Override
	public void som() {
		System.out.println("O som é: WEEEEE");
	}
	void acao() {
		System.out.println("E ele sobe em árvores...\n");
	}
}
