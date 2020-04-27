package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdicionarPositivo {

	public static float leitor(String nome) throws InputMismatchException {
		
		float aux = -1;
		int valida = 1;
		
		Scanner leitor = new Scanner(System.in);
		do {
			System.out.printf("%s: ",nome);
			try {
				aux = leitor.nextFloat();
			}catch(RuntimeException e) {
				System.out.println("Apenas números inteiros! Digite novamente.\n");
				leitor.nextLine();
				valida = 0;
			}

			if (aux < 0 && valida == 1) {
				System.out.println("Apenas números positivos! Digite novamente.\n");
			}

			valida=1;
		}while(aux<0);
		
		return aux;
	}

}