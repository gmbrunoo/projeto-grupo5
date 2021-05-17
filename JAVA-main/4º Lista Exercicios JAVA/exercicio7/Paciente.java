package exercicio7;

public class Paciente {
	
	//Atributos
	private String nome;
	private String alergia;
	private String seuDiagnostico;
	private String suaPressao;
	private int idade;
	
	//Métodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAlergia() {
		return alergia;
	}
	public void setAlergia(String alergia) {
		this.alergia = alergia;
	}
	public String getSeuDiagnostico() {
		return seuDiagnostico;
	}
	public void setSeuDiagnostico(String seuDiagnostico) {
		this.seuDiagnostico = seuDiagnostico;
	}
	public String getSuaPressao() {
		return suaPressao;
	}
	public void setSuaPressao(String suaPressao) {
		this.suaPressao = suaPressao;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
