package br.com.generation.lista1;
/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/
import java.util.Scanner;

public class IdadeAnosMesesDias {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, d;
		
		System.out.println("Digite sua idade em dias: ");
		a = ler.nextInt();

		b = a / 365;
		System.out.println("Sua idade em anos: " + b);
		
		c = (int) ((a/30.417) - (b*12));
		System.out.println("Meses: " + c);
		
		d = (int) (a-(b*365)-(c*30.417));
		System.out.println("Dias: " + d);
		
		ler.close();
	}

}
