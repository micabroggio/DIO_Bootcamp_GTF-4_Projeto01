public class ContaCorrente extends Conta {

	// cria nova conta poupança
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		setModalidade(1);
	}

	// cria extrato
	@Override
	public void imprimirExtrato() {
		System.out.println("==============================");
		System.out.println("=== Extrato Conta Corrente ===");
		System.out.println("==============================");
		this.imprimirInfosComuns();
		System.out.printf("Modalidade: %d%n",1);
		System.out.println("==============================");
		System.out.println("\n");
	}

	// cria modalidade de conta
	public void setModalidade(int modalidade) {
		this.modalidade = modalidade;
	}
	
}
