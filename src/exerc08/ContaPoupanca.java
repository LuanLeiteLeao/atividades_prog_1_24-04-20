package exerc08;

public class ContaPoupanca {
	private String nome;
	private int numeroConta;
	private String agencia;
	private double deposito;
	private double saldo;
	private double opcao;

	public ContaPoupanca(String nome, int numeroConta, String agencia, double saldo, int opcao) {
		super();
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.opcao = opcao;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getOpcao() {
		return opcao;
	}

	public void setOpcao(double opcao) {
		this.opcao = opcao;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double saldoDeposito() {
		return this.getSaldo()+this.getOpcao();
	}
	
	public double saldoSaque() {
		return this.getSaldo()-this.getOpcao();
	}
}
