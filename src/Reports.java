// Classe para avisos e interacoes entre programa e usuario

import java.util.Arrays;
import java.util.Scanner;

public class Reports{

    // metodo de respostas genericas para respostas em inteiro
    protected static int respInt(){
        Scanner resp = new Scanner(System.in);
        int respSaida = resp.nextInt();
        return respSaida;
    }

    // metodo de respostas genericas para respostas em string
    protected static String respString(){
        Scanner resp = new Scanner(System.in);
        String respSaida = resp.nextLine();
        return respSaida;
    }

    // metodo de respostas genericas para respostas em double
    protected static Double respDouble(){
        Scanner resp = new Scanner(System.in);
        Double respSaida = resp.nextDouble();
        return respSaida;
    }

    // input de novos clientes
    protected static String novoCliente() {
        System.out.print("Nome do Cliente:");
        return respString();
    }

    // Metodo para novas operacoes ou finalizacao do atendimento
    protected static int outraOperacao() {
        System.out.print("Deseja fazer outra operacao? (S/N)");
        String respSaidaString = respString();
        while (!Arrays.asList("S", "s", "N", "n").contains(respSaidaString)) {
            System.out.print("Deseja fazer outra operacao? (S/N)");
            respSaidaString = respString();
        }
        int respSaida = 999;
        if (Arrays.asList("N", "n").contains(respSaidaString)) {
            respSaida = 0;
        } else if (Arrays.asList("S", "s").contains(respSaidaString)) {
            respSaida = 999;
        }
        return respSaida;
    }

    // input para operacoes
    protected static int opcoesOperacao() {
        System.out.print("\nPara depositar, digite 1.");
        System.out.print("\nPara sacar, digite 2.");
        System.out.print("\nPara transferir, digite 3.");
        System.out.print("\nPara encerrar as operacoes, digite 0.");
        System.out.print("\n ");
        System.out.print("\nSua escolha:");
        return respInt();
    }

    // input para a interacao inicial da plataforma
    protected static int respCabecalho() {
        System.out.print("\n=== Bem vindo ao portal do DioBank ===");
        System.out.print("\n ");
        System.out.print("\nPara criar uma nova conta corrente, digite 1.");
        System.out.print("\nPara criar uma nova conta poupanca, digite 2.");
        System.out.print("\nPara realizar uma operacao (saque, deposito ou transferencia), digite 3.");
        System.out.print("\nPara encerrar o atendimento, digite 0.");
        System.out.print("\n ");
        System.out.print("\nSua escolha:");
        return respInt();
    }

    // input para conta existente
    protected static int encontraConta() {
        System.out.print("Digite o numero da sua conta:");
        return respInt();
    }

    // input para conta destino em caso de transferencia
    protected static int contaDestino() {
        System.out.print("Digite o numero da conta do destinatário:");
        return respInt();
    }

    // input para valores de operacoes
    protected static Double valorOperacao() {
        System.out.print("Digite o valor da operacao:");
        return respDouble();
    }

    // finalizacao de atendimento
    protected static void msgFinalizaAtendimento() {
        System.out.print("\nObrigado por escolher o DioBank!");
        System.out.print("\n=== Atendimento finalizado ====\n");
    }

}
