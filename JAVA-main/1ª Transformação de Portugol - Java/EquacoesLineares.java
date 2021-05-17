package br.com.generation.lista1;

import java.util.Scanner;

/*Um sistema de equações lineares do tipo:....
, pode ser resolvido segundo mostrado abaixo :....
Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.*/
public class EquacoesLineares {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a,b,c,d,e,f,x,y;
		
		System.out.println("Digite a: ");
		a = ler.nextInt();
		
		System.out.println("Digite b: ");
		b = ler.nextInt();

		System.out.println("Digite c: ");
		c = ler.nextInt();
		
		System.out.println("Digite d: ");
		d = ler.nextInt();
		
		System.out.println("Digite e: ");
		e = ler.nextInt();
		
		System.out.println("Digite f: ");
		f = ler.nextInt();
		
		x = ((c*e)-(b*f)/(a*e)-(b*d));
		
		System.out.println("Valor de x: " + x);
		
		y = ((a*f)-(c*d)/(a*e)-(b*d));
		
		System.out.println("Valor de y: " + y);
		
		ler.close();
	}

}
