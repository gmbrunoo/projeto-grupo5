package br.com.generation.lista1;
/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/
import java.util.Scanner;

public class MediasAlunos {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double nota1, nota2, media, nota3;
		
		System.out.println("Digite a 1ª nota: ");
		nota1 = ler.nextDouble();
		
		System.out.println("Digite a 2ª nota: ");
		nota2 = ler.nextDouble();
		
		System.out.println("Digite a 3ª nota: ");
		nota3 = ler.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("A nota é: " + media);
		
		ler.close();

	}

}
