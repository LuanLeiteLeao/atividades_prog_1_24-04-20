package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdicionarNum {

	public static float leitor(String nome) throws InputMismatchException {
		
		float aux = -1;
		int valida=0;
		
		Scanner leitor = new Scanner(System.in);
		do {
			System.out.printf("%s: ",nome);
			try {
				aux = leitor.nextFloat();
			}catch(RuntimeException e) {
				System.out.println("Apenas números inteiros! Digite novamente.\n");
				leitor.nextLine();
			}
			
			if(aux>=0||aux<=0)
			{
				valida=1;
			}
			
		}while(valida!=1);
		
		return aux;
	}

}