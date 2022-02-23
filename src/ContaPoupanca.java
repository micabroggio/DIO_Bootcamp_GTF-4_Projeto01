public class ContaPoupanca extends Conta {

	// cria nova conta corrente
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		setModalidade(2);
	}

	// cria extrato
	@Override
	public void imprimirExtrato() {
		System.out.println("==============================");
		System.out.println("=== Extrato Conta Poupanca ===");
		System.out.println("==============================");
		this.imprimirInfosComuns();;
		System.out.printf("Modalidade: %d%n",2);
		System.out.println("==============================");
		System.out.println("\n");
	}

	// cria modalidade de conta
	public void setModalidade(int modalidade) {
		this.modalidade = modalidade;
	}

}
