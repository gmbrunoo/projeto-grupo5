package lista2;

import java.util.Scanner;

/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
public class Exercicio6DoWhile {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int numero, media, i=0, soma=0;
		
		do {
			System.out.printf("Digite um número: ");
			numero = ler.nextInt();
			
			if(numero%3 == 0 && numero != 0) {
				soma = soma + numero;
				
				i++;
			}
		}while(numero != 0);
		
		media = soma / i;
		
		System.out.println("A média dos números digitados é: " + media);
		
		ler.close();
	}

}
