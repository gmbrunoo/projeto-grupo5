package br.com.generation.renan;

import java.util.Scanner;

public class EntradaSaida {
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.println("Digite o valor de a: ");
		a = ler.nextInt();
		
		System.out.println("Digite o valor de b: ");
		b = ler.nextInt();
		
		soma = a + b;
		
		System.out.println("A soma de a e b é: " + soma);
		
		ler.close();
	}

}
