package br.com.generation.lista1;

import java.util.Scanner;
/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/
public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite o 1º número: ");
		num1 = ler.nextInt();
		
		System.out.println("Digite o 2º número: ");
		num2 = ler.nextInt();
		
		System.out.println("Digite o 3º número: ");
		num3 = ler.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("O maior número é o 1º e ele vale: " + num1);
		}
		else if(num2>num3 && num2>num1) {
			System.out.println("O maior número é o 2º e ele vale: " + num2);
		}
		else if(num3>num1 && num3>num2) {
			System.out.println("O maior número é o 3º e ele vale: " + num3);
		}
		
		ler.close();
	}

}
