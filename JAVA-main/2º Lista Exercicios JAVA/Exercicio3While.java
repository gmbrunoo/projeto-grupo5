package lista2;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
public class Exercicio3While {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int idade, menos = 0, mais = 0;
		
		System.out.printf("Digite sua idade: ");
		idade = ler.nextInt();
		
		while(idade != -99) {
			if(idade<21) {
				menos++;
			}
			else if(idade>50) {
				mais++;
			}
			System.out.printf("Digite sua idade: ");
			idade = ler.nextInt();
		}
		System.out.println("De acordo com as idade digitadas, temos: " + menos + " pessoas com menos de 21 anos e " + mais + " com mais de 50 anos.");
		ler.close();
	}

}
