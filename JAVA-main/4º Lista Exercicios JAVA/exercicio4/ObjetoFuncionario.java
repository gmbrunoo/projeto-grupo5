package exercicio4;

public class ObjetoFuncionario {

	public static void main(String[] args) {
		
		Funcionario colaborador = new Funcionario();
		
		colaborador.setNome("Renan Gonçalves Vanni");
		colaborador.setAltura(1.87);
		colaborador.setPeso(70);
		colaborador.setCodigo(729898);
		
		System.out.println("O nome do(a) funcionário(a) é: " + colaborador.getNome());
		System.out.println("A altura é " + colaborador.getAltura() + " e peso de " + colaborador.getPeso() + "Kg");
		System.out.println("Seu código é: " + colaborador.getCodigo());
	}

}
