package br.com.generation.lista1;
/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/
import java.util.Scanner;

public class IdadeDias {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, d, anoBissexto;
		
		System.out.println("Digite sua idade em anos: ");
		a = ler.nextInt();
		
		System.out.println("Complemente com os meses: ");
		b = ler.nextInt();
		
		System.out.println("Dias: ");
		c = ler.nextInt();
		
		anoBissexto = a / 4;
		
		d = ((a*365)+(b*30)+c+anoBissexto);
		
		System.out.println("Sua idade em dias é: " + d);
	
		ler.close();
	}

}
