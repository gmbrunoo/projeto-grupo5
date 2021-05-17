package exercicio3;

public class ObjetoProdutoEletronico {

	public static void main(String[] args) {
		
		ProdutoEletronico celular = new ProdutoEletronico();
		
		celular.setMarcaCelular("Apple");
		celular.setModelo("XR");
		celular.setCor("Preta");
		celular.setPeso(200);
		celular.setProcessador(2.65);
		
		System.out.println("A marca é:" + celular.getMarcaCelular());
		System.out.println("O modelo é: " + celular.getModelo());
		System.out.println("A cor é: " + celular.getCor());
		System.out.println("O peso do celular é de: " + celular.getPeso());
		System.out.println("E o processador é de: " + celular.getProcessador());

	}

}
