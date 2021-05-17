package lista3;

import java.util.Scanner;

//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner escreva = new Scanner(System.in);
		
		double[][] matriz = new double[3][3];
		double maiorDez = 0.0;
		
		for(int l=0;l<matriz.length;l++) {
			for(int c=0;c<matriz.length;c++) {
				System.out.printf("Digite o valor de [%d][%d]: ", l, c);
				matriz[l][c] = escreva.nextDouble();
				
				if(matriz[l][c]>10) {
					maiorDez++;
				}
			}
		}
		System.out.println("Tiveram " + maiorDez + " números maiores que 10");
		
		escreva.close();
	}

}
