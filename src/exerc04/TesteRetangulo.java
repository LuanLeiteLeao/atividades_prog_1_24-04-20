package exerc04;

public class TesteRetangulo {

	public static void main(String[] args) {
		Retangulo valor = new Retangulo(2, 4);
		
		System.out.printf("A área do retângulo é: %.1f",valor.calculaAreaRetangulo());
		System.out.printf("\nO perímetro do retãngulo é: %.1f",valor.calculaPerimetro());

	}

}
