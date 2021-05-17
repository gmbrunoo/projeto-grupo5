package exercicio1;

public class TesteAnimais {
	
	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Cavalo pedepano = new Cavalo();
		Preguica pregui = new Preguica();
		
		dog.setTamanho(50);
		dog.setRaca("Husky Siberiano");
		
		pedepano.setTamanhaAnca("Grande");
		pedepano.setPosicaoOrelhas("Para frente e para cima");
		pedepano.setIdade(4);
		
		pregui.setPeso(21);
		pregui.setIdade(5);
		
		System.out.println("==Dados do Cachorro==");
		System.out.println("O tamanho dele é: " + dog.getTamanho());
		System.out.println("A raça é: " + dog.getRaca());
		
		System.out.println();
		System.out.println("==Dados do Cavalo==");
		System.out.println("O tamanho da anca é: " + pedepano.getTamanhaAnca());
		System.out.println("A posição das orelhas é: " + pedepano.getPosicaoOrelhas());
		System.out.println("Sua idade é: " + pedepano.getIdade());
		
		System.out.println();
		System.out.println("==Dados da Preguiça==");
		System.out.println("O peso é: " + pregui.getPeso());
		System.out.println("E o peso dele é: " + pregui.getIdade());
	}

}
