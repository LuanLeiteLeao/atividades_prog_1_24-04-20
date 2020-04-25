package utils;

public class Valida {
	
	static	public void validaNegativo(double numero) throws Exception{
		
		if (numero < 0) {
			throw new RuntimeException("O número não pode ser negativo!");
		}
		
	}

}
