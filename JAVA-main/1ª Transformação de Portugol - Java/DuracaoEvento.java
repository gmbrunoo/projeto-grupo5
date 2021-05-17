package br.com.generation.lista1;
/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
import java.util.Scanner;

public class DuracaoEvento {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, d;
		
		System.out.println("Digite a duração do evento em segundos: ");
		a = ler.nextInt();
		
		b = a / 3600;
		System.out.println("Duração em horas é: " + b);
		
		c = ((a/60)-(b*60));
		System.out.println("Duração em minutos é: " + c);
		
		d = (a-(b*3600)-(c*60));
		System.out.println("Duração em segundos é: " + d);
		
		ler.close();
	}

}
