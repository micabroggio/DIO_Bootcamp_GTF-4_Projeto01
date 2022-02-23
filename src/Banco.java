import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	// get para o nome do banco
	public String getNome() {
		return nome;
	}

	// set para o nome do banco
	public void setNome(String nome) {
		this.nome = nome;
	}

	// get para as contas no banco de dados do banco
	public List<Conta> getContas() {
		return contas;
	}

	// cria o banco de dados com lista de contas no banco de dados do banco
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
