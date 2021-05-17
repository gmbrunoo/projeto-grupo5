package br.com.generation.lista1;

import java.util.Scanner;
import java.lang.Math;

public class CalculoUmaExpressao {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int a,b,c;
		double d;
		
		System.out.println("Digite o 1º numero inteiro: ");
		a = ler.nextInt();
		
		System.out.println("Digite o 2º numero inteiro: ");
		b = ler.nextInt();
		
		System.out.println("Digite o 3º numero inteiro: ");
		c = ler.nextInt();
		
		d = ((Math.pow((a+b),2)+(Math.pow((b+c), 2))/2));
		System.out.println("Resultado da conta: " + d);
		
		ler.close();
	}

}
