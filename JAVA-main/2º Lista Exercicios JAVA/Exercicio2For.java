package lista2;

import java.util.Scanner;

/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
public class Exercicio2For {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int numero, contaPar = 0, contaImpar = 0, a;
		
		for(numero=0;numero<=10;numero++){
			System.out.println("Digite um número: ");
			a = ler.nextInt();
			
			if(a%2 == 0) {
				contaPar++;
			}else {
				contaImpar++;
			}
		}
		System.out.println("Nos 10 números tem " + contaPar + " pares e " + contaImpar + " impares");
		ler.close();
	}
}
