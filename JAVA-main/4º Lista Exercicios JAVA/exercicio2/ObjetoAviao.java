package exercicio2;

public class ObjetoAviao {
	
	public static void main(String[] args) {
		
		Aviao a1 = new Aviao();
		
		a1.modelo = "Boeing";
		a1.cor = "Branco";
		a1.potencia = "165 mil cv";
		a1.velocidade = 800;
		a1.altitudeTotal = 0;
		
		a1.aceleracao(100);
		System.out.println("Após a aceleração o avião estava a " + a1.velocidade + "km/h");
		
		a1.altitude(15000);
		System.out.println("A altitude máxima que o avião alcançou na viagem foi: " + a1.altitudeTotal + " metros");
	}

}
