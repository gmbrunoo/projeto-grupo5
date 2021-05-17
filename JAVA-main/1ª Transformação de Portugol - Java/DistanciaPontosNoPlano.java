package br.com.generation.lista1;

import java.util.Scanner;
import java.lang.Math;

public class DistanciaPontosNoPlano {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float x1,x2,y1,y2;
		double d;
		
		System.out.println("Digite o valor de x1: ");
		x1 = ler.nextFloat();
		
		System.out.println("Digite o valor de y1: ");
		y1 = ler.nextFloat();
		
		System.out.println("Digite o valor de x2: ");
		x2 = ler.nextFloat();

		System.out.println("Digite o valor de y2: ");
		y2 = ler.nextFloat();
		
		d = (Math.sqrt((Math.pow((x2-x1), 2))+(Math.pow((y2-y1), 2))));
		
		System.out.println("A distância entre os pontos é: " + d);
		
		ler.close();
	}

}
