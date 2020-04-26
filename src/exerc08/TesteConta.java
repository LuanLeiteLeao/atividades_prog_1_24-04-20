package exerc08;

import utils.Adicionar;
import utils.LeitorString;

public class TesteConta {

	public static void main(String[] args) {
		
		System.out.println("CONTA POUPANÇA");
		
		String nome;
		
		//recebe a string digitada da class LeitorString
		nome = LeitorString.leitor("Nome do cliente");
		
		//aux = new ContaPoupanca("Rodrigo",12,"Agencia",1000,2);
		
		//Aqui imprimo o nome recebido da classe
		System.out.printf("Nome: %s",nome);

	}

}
