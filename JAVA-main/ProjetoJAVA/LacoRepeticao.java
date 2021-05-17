package br.com.generation.lacocondicional;

public class LacoRepeticao {

	public static void main(String[] args) throws InterruptedException {
		
		int numero = 10;
		
		while(numero > 0) {
			System.out.println("\nContando..." + numero);
			numero = numero - 1;
			
			Thread.sleep(1000);
		}
		System.out.println("\nContando parada...");

	}

}
