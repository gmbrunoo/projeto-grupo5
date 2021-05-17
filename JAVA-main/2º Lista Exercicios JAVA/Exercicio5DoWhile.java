package lista2;

import java.util.Scanner;

/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
public class Exercicio5DoWhile {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int numero, soma=0;
		
		do {
			System.out.printf("Digite um número: ");
			numero = ler.nextInt();
			
			soma = soma + numero;
		}while(numero != 0);
		
		System.out.printf("A soma dos números digitados é: " + soma);
		ler.close();
	}

}
