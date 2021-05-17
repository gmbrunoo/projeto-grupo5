package interfaceEx2;

public class TestaAnimal {

	public static void main(String[] args) {
		
		Animal r = new Cachorro();
		
		r.nome();
		r.idade();
		r.som();
		((Cachorro) r).acao();
		
		r = new Cavalo();
		
		r.nome();
		r.idade();
		r.som();
		((Cavalo) r).acao();
		
		r = new Preguica();
		
		r.nome();
		r.idade();
		r.som();
		((Preguica) r).acao();
	}
}
