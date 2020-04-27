package exerc17;

public class TesteNumeroComplexo {

	public static void main(String[] args) {
		NumeroComplexo Complexo1 = new NumeroComplexo (4.5, 6.7);
		NumeroComplexo Complexo2 = new NumeroComplexo (7.8, -9.1);
		NumeroComplexo zero = new NumeroComplexo(0, 0);
		
		System.out.println("Soma: "+NumeroComplexo.soma(Complexo1, Complexo2));
	}

}
