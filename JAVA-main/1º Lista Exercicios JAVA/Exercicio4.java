package br.com.generation.lista1;

import java.util.Scanner;

/*Faça um programa em que permita a entrada de um número qualquer e 
 * exiba se este número é par ou ímpar. Se for par exiba também a raiz 
 * quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.*/
public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero;
		double raiz, quadrado;
		
		System.out.println("Digite um número qualquer: ");
		numero = ler.nextInt();
		
		if(numero%2 == 0) {
			System.out.println("Esse número é PAR");
			raiz = Math.sqrt(numero);
			System.out.println("A raiz desse número é: " + raiz);
		}else {
			System.out.println("Esse número é IMPAR");
			quadrado = Math.pow(numero, 2);
			System.out.println("O número elevado ao quadrado é: " + quadrado);
		}
		ler.close();
	}
}
