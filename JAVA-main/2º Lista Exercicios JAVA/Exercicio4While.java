package lista2;

import java.util.Scanner;

/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
- o número de pessoas calmas;
- o número de mulheres nervosas;
- o número de homens agressivos;
- o número de outros calmos;
- o número de pessoas nervosas com mais de 40 anos;
- o número de pessoas calmas com menos de 18 anos.*/
public class Exercicio4While {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int idade, sexo, temperamento, i=1, calma=0, nervosa=0, agressiva=0, nervosa1=0, calma1=0;
		
		System.out.printf("Digite sua idade: ");
		idade = ler.nextInt();
			
		System.out.printf("Digite seu sexo (1-feminino / 2-masculino / 3-Outros): ");
		sexo = ler.nextInt();
			
		System.out.printf("Digite 1, se você é uma pessoa calma; 2, se é uma pessoa nervosa e 3, se é uma pessoa agressiva: ");
		temperamento = ler.nextInt();
			
		while(i<150) {
			
			i++;
			
			if(temperamento == 1) {
				calma++;
			}
			else if(sexo == 1 && temperamento == 2) {
				nervosa++;
			}
			else if(sexo == 2 && temperamento == 3) {
				agressiva++;
			}
			else if(idade > 40 && temperamento == 2) {
				nervosa1++;
			}
			else if(idade < 18 && temperamento == 1) {
				calma1++;
			}
			System.out.printf("Digite sua idade: ");
			idade = ler.nextInt();
				
			System.out.printf("Digite seu sexo (1-feminino / 2-masculino / 3-Outros): ");
			sexo = ler.nextInt();
				
			System.out.printf("Digite 1, se você é uma pessoa calma; 2, se é uma pessoa nervosa e 3, se é uma pessoa agressiva: ");
			temperamento = ler.nextInt();
		}
		System.out.println("O número de pessoas calmas é: " + calma);
		System.out.println("O número de mulheres nervosas é: " + nervosa);
		System.out.println("O número de de homens agressivos é: " + agressiva);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é: " + nervosa1);
		System.out.println("O número de pessoas calmas com menos de 18 anos é: " + calma1);
		
		ler.close();
	}

}
