package br.versaoalfa;

public class Familia extends Pessoa {//Herança
	
	private int geladeira, carro, televisao, computador, qtdPessoas;
	private double rendaFamiliar;
	
	//Encapsulamento
	public int getGeladeira() {
		return geladeira;
	}
	public void setGeladeira(int geladeira) {
		this.geladeira = geladeira;
	}
	public int getCarro() {
		return carro;
	}
	public void setCarro(int carro) {
		this.carro = carro;
	}
	public int getTelevisao() {
		return televisao;
	}
	public void setTelevisao(int televisao) {
		this.televisao = televisao;
	}
	public int getComputador() {
		return computador;
	}
	public void setComputador(int computador) {
		this.computador = computador;
	}
	public int getQtdPessoas() {
		return qtdPessoas;
	}
	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}
	public double getRendaFamiliar() {
		return rendaFamiliar;
	}
	public void setRendaFamiliar(double rendaFamiliar) {
		this.rendaFamiliar = rendaFamiliar;
	}
	
}
