package exerc03;

public class TesteEsfera {

	public static void main(String[] args) {
		
		Esfera valor = new Esfera(6);
		
		System.out.printf("Área da esfera: %.2fm²", valor.areaTotalEsfera());
		System.out.printf("\n\nVolume da esfera: %.2fm³", valor.volumeEsfera());

	}

}
