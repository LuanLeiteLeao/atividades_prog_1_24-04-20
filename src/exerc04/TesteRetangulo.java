package exerc04;

public class TesteRetangulo {

	public static void main(String[] args) {
		Retangulo valor = new Retangulo(2, 4);
		
		System.out.printf("A �rea do ret�ngulo �: %.1f",valor.calculaAreaRetangulo());
		System.out.printf("\nO per�metro do ret�ngulo �: %.1f",valor.calculaPerimetro());

	}

}
