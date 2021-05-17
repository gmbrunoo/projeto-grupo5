package br.versaoalfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Metodo extends /*Heran�a*/ Acessibilidade{
	
	Scanner ler = new Scanner(System.in);
	Scanner lerString = new Scanner(System.in);
	Acessibilidade aces = new Acessibilidade();
	ArrayList<String> teste = new ArrayList();//Colletions
	
	public void cadastrarPessoa() {
		
		System.out.println("=============================================================================");
		System.out.println("=============================== Pesquisa IBGE ===============================");
		System.out.println("=============================================================================\n\n");
		
		System.out.println("******************************* Dados Pessoais *******************************\n");
		
		System.out.println("1 - Digite seu  nome: ");
		aces.setNome(lerString.next());
		
		System.out.println("2 - Digite seu CPF: ");
		aces.setCpf(ler.next());
		
		System.out.println("3 - Digite sua idade: ");
		aces.setIdade(ler.nextInt());
		
		System.out.println("\n");
		cadastrarFamilia();
	}
	public void cadastrarFamilia() {
		System.out.println("******************************* Nucleo Familiar *******************************\n");
		
		System.out.println("1 - Digite a quantidade de pessoas na sua casa: ");
		aces.setQtdPessoas(ler.nextInt());
		
		System.out.println("2 - Digite a renda familiar: ");
		aces.setRendaFamiliar(ler.nextDouble());
		
		System.out.println("\n******************************* Residencia *******************************\n");
		
		System.out.println("1 - Digite a quantidade de geladeiras na sua casa: ");
		aces.setGeladeira(ler.nextInt());
		
		System.out.println("2 - Digite a quantidade de carros sua familia possui: ");
		aces.setCarro(ler.nextInt());
		
		System.out.println("3 - Digite a quantidade de televis�es na sua casa: ");
		aces.setTelevisao(ler.nextInt());
		
		System.out.println("4 - Digite a quantidade de computadores na sua casa: ");
		aces.setComputador(ler.nextInt());
		
		System.out.println("\n");
		cadastrarAcessibilidade();
	}
	public void cadastrarAcessibilidade() {
		int i;
		int d;
		System.out.println("******************************* Ensino *******************************\n");
		
		System.out.println("1 - Todos na sua casa possuem  acesso a educa��o? [Sim = 1 | N�o = 2]");
		i = ler.nextInt();
		if(i == 1) {
			aces.setEducacao("Sim");
		}else if (i == 2){
			aces.setEducacao("N�o");
		}else {
			System.out.println("Op��o inv�lida");
			return;
		}
		System.out.println("2 - Todos na sua casa possuem  acesso a internet? [Sim = 1 | N�o = 2]");
		d = ler.nextInt();
		if(d == 1) {
			aces.setInternet("Sim");
		}else if (d == 2){
			aces.setInternet("N�o");
		}else {
			System.out.println("Op��o inv�lida");
			return;
		}
		calculaVunerabilidade();
	}
	public void metodo2() {
		int i;
				
		System.out.println("\nRealizar um novo cadastro ?");
		System.out.println("   [Sim = 1 | N�o = 2]     ");
		System.out.println("\n");
		i = lerString.nextInt();
		
		if(i == 1) {
			//limpaTela();
			cadastrarPessoa();
		}else if(i != 1){
			System.out.println(teste);
			return;
		}
	}
	public void calculaVunerabilidade() {
		double renda = aces.getRendaFamiliar();
		int qtdPessoas = aces.getQtdPessoas();
		
		String educacao = aces.getEducacao(), internet = aces.getInternet();
		
		if(renda < 1100 && educacao == "N�o" && internet == "N�o") {
			System.out.println("\n===========================================================================");
			System.out.println("============================== Ajuda urgente! =============================");
			System.out.println("=============================== Prioridade 3 ==============================");
			System.out.println("===========================================================================");
			
		}else if(renda < 1100 && educacao == "N�o" && internet == "Sim") {
			System.out.println("\n===========================================================================");
			System.out.println("=============================== Prioridade 3 ==============================");
			System.out.println("===========================================================================");
		
		}else if(renda < 1100 && educacao == "Sim" && internet == "N�o") {
			System.out.println("\n===========================================================================");
			System.out.println("=============================== Prioridade 3 ==============================");
			System.out.println("===========================================================================");
		
		}else if(renda < 1100 && educacao == "Sim" && internet == "Sim") {
			System.out.println("\n===========================================================================");
			System.out.println("=============================== Prioridade 3 ==============================");
			System.out.println("===========================================================================");
		
		}else if(renda <= 1600 && educacao == "N�o" && internet == "N�o" && qtdPessoas >= 5 && renda >= 1101) {
			System.out.println("\n===========================================================================");
			System.out.println("=============================== Prioridade 2 ==============================");
			System.out.println("===========================================================================");
		
		}else if(renda <= 1600 && educacao == "N�o" && internet == "Sim" && qtdPessoas >= 5 && renda >= 1101) {
			System.out.println("\n===========================================================================");
			System.out.println("=============================== Prioridade 2 ==============================");
			System.out.println("===========================================================================");
		
		}else if(renda <= 1600 && educacao == "Sim" && internet == "N�o" && qtdPessoas >= 5 && renda >= 1101) {
			System.out.println("\n===========================================================================");
			System.out.println("=============================== Prioridade 1 ==============================");
			System.out.println("===========================================================================");
		
		}else if(renda <= 1600 && educacao == "Sim" && internet == "Sim" && qtdPessoas >= 5 && renda >= 1101) {
			System.out.println("\n===========================================================================");
			System.out.println("=============================== Prioridade 1 ==============================");
			System.out.println("===========================================================================");
		
		}else {
			System.out.println("\n==========================================================================");
			System.out.println("=============================== Familia OK ===============================");
			System.out.println("==========================================================================");
		}
				
		teste.add("\nNome: "   + aces.getNome()  + "\n" +
                "Idade: "  + aces.getIdade() + "\n" +
                "CPF: " + aces.getCpf() + "\n" +
                "N�cleo Familiar: "+ aces.getQtdPessoas() + " pessoas\n" +
                "Renda Familiar: "+ aces.getRendaFamiliar() + " R$\n" +
                "Geladeiras: " + aces.getGeladeira() + "\n" +
                "Carros: "+ aces.getCarro()+ "\n" +
                "Televisores: " + aces.getTelevisao()+ "\n" +
                "Computadores: "+ aces.getComputador()+ "\n" +
                "Possu� acesso a Educa��o? "+ aces.getEducacao()+ "\n" +
                "Possu� acesso a Internet? "+ aces.getInternet() + "\n");
		metodo2();
	}
	public void limpaTela() {
		for (int i = 0; i < 50; ++i) {  
			 System.out.println();  
		}
		
	}
}
