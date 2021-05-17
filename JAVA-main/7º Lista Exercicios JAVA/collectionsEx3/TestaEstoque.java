package collectionsEx3;

import java.util.ArrayList;

public class TestaEstoque {

	public static void main(String[] args) {
		
		Estoque produto1 = new Estoque("Aspirador de Pó", 200);
		Estoque produto2 = new Estoque("Geladeira", 100);
		Estoque produto3 = new Estoque("Micro-ondas", 150);
		
		ArrayList<Estoque> lista = new ArrayList<>();
		lista.add(produto1);
		lista.add(produto2);
		lista.add(produto3);
		
		System.out.println(lista);
		
		lista.remove(1);
		System.out.println(lista);
	}
}
