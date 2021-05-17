package lista3;

import java.util.Scanner;

/*Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.*/
public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner receba = new Scanner(System.in);
		
		int[] numerosInteiros = new int[6];
		int somaPar = 0, somaImpar = 0;
		
		for(int i=0;i<numerosInteiros.length;i++) {
			
			System.out.print("Digite o " + (i+1) + "º número inteiro: ");
			numerosInteiros[i] = receba.nextInt();
			
			if(numerosInteiros[i]%2 == 0) {
				somaPar = somaPar + numerosInteiros[i];
			}
			else if(numerosInteiros[i]%2 == 1) {
				somaImpar = somaImpar + numerosInteiros[i];
			}
		}
		System.out.print("São pares: ");
		for(int i=0;i<numerosInteiros.length;i++) {
			if(numerosInteiros[i]%2 == 0) {
				System.out.print(numerosInteiros[i] + ", ");
			}
		}
		System.out.println();
		System.out.print("São impares: ");
		for(int i=0;i<numerosInteiros.length;i++) {
			if(numerosInteiros[i]%2 == 1) {
				System.out.print(numerosInteiros[i] + ", ");
			}
		}
		System.out.println();
		System.out.println("A soma dos números pares é: " + somaPar);
		System.out.println("A soma dos números impares é: " + somaImpar);
		
		receba.close();
	}

}
