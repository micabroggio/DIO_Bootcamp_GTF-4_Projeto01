import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		List contas; // declara a lista de contas
		contas = new ArrayList(); // cria nova lista

		List contasDioBank; // declara a lista de contas
		contasDioBank = new ArrayList(); // cria nova lista

		Banco bd = new Banco(); // cria um novo banco
		bd.setNome("DioBank");

		int respSaida = 1; // declara variavel de saida
		while (respSaida != 0) { // iteracao para permanecer nas atividades de atendimento

			respSaida = Reports.respCabecalho(); // metodo para escolha de atendimento

			if (respSaida == 1) { // condicional para novas contas correntes

				Cliente novoCliente = new Cliente(); // cria novo cliente
				String nomeCliente = Reports.novoCliente(); // input para nome do cliente
				novoCliente.setNome(nomeCliente); // aplica o nome do novo cliente

				Conta novaConta = new ContaCorrente(novoCliente); // cria um nova conta no nome do cliente

				novaConta.imprimirExtrato(); // imprime o extrato da nova conta

				contas.add(novaConta); // adiciona a nova conta a lista de contas

				Reports.outraOperacao(); // input para novas operacoes ou finalizacao do atendimento

				bd.setContas(contas); // metodo de alimentacao do banco de dados do banco

			}else if (respSaida == 2) { // condicional para novas contas poupanca

				Cliente novoCliente = new Cliente(); // cria novo cliente
				String nomeCliente = Reports.novoCliente(); // input para nome do cliente
				novoCliente.setNome(nomeCliente); // aplica o nome do novo cliente

				Conta novaConta = new ContaPoupanca(novoCliente); // cria um nova conta no nome do cliente

				novaConta.imprimirExtrato(); // imprime o extrato da nova conta

				contas.add(novaConta); // adiciona a nova conta a lista de contas

				Reports.outraOperacao(); // input para novas operacoes ou finalizacao do atendimento

				bd.setContas(contas); // metodo de alimentacao do banco de dados do banco

			}else if (respSaida == 3) { // condicional para operacoes

				int respOperacao = 1; // declara variavel para respostas as operacoes
				while (respOperacao != 0) { // iteracao para permanecer nas operacoes

					respOperacao = Reports.opcoesOperacao();  // metodo para escolha de operacao

					if (respOperacao == 1) { // condicional para deposito

						int numeroConta = Reports.encontraConta(); // input para conta
						Double valorOpe = Reports.valorOperacao(); // input para valor de operacao
						contasDioBank = bd.getContas(); // get das contas contidas no banco
						Conta contaOperacao = (Conta) contasDioBank.get(numeroConta - 1); // get da conta
						contaOperacao.depositar(valorOpe); // aplica o metodo de deposito
						contaOperacao.imprimirExtrato(); // imprime extrato
						Reports.outraOperacao(); // input para novas operacoes ou finalizacao do atendimento
						bd.setContas(contasDioBank); // metodo de alimentacao do banco de dados do banco

					} else if (respOperacao == 2) { // condicional para saque

						int numeroConta = Reports.encontraConta(); // input para conta
						Double valorOpe = Reports.valorOperacao(); // input para valor de operacao
						contasDioBank = bd.getContas(); // get das contas contidas no banco
						Conta contaOperacao = (Conta) contasDioBank.get(numeroConta - 1); // get da conta
						contaOperacao.sacar(valorOpe); // aplica o metodo de saque
						contaOperacao.imprimirExtrato(); // imprime extrato
						Reports.outraOperacao(); // input para novas operacoes ou finalizacao do atendimento
						bd.setContas(contasDioBank); // metodo de alimentacao do banco de dados do banco

					} else if (respOperacao == 3) { // condicional para transferencia

						int numeroConta = Reports.encontraConta(); // input para conta
						Double valorOpe = Reports.valorOperacao(); // input para valor de operacao
						contasDioBank = bd.getContas(); // get das contas contidas no banco
						int numeroContaDestino = Reports.contaDestino(); // input para conta destino
						Conta contaOperacao = (Conta) contasDioBank.get(numeroConta - 1); // get da conta
						Conta destinoConta = (Conta) contasDioBank.get(numeroContaDestino - 1); // get da conta destino
						contaOperacao.transferir(valorOpe, destinoConta); // aplica o metodo de transferencia
						contaOperacao.imprimirExtrato(); // imprime extrato
						Reports.outraOperacao(); // input para novas operacoes ou finalizacao do atendimento
						bd.setContas(contasDioBank); // metodo de alimentacao do banco de dados do banco

					}

				}

			}

		}

		Reports.msgFinalizaAtendimento(); // metodo de alerta de finalizacao de atendimento

	}

}
