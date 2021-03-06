import Contas.Conta;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;
import Contas.Imprimivel;

import java.util.Scanner;

public class Executavel {
    public Executavel() {}

    public void Executar() {

        Banco caixa = new Banco();
        menu(caixa);
    }

    private int menu(Banco banco) {
        System.out.println("""
                Bem vindo! Selecione uma opção:
                (1) Criar conta
                (2) Consultar conta
                (3) Encerrar conta
                (4) Gerar relatório de todas as contas
                (5) Sair
                """);

        var resp = s.nextInt();

        try {
            direcionarMenu(resp, banco);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (resp != 5) resp = menu(banco);
            return resp;
        }
    }

    private void direcionarMenu(int resp, Banco b) throws Exception {
        switch (resp) {
            case 1: criarContaMenu(b); break;
            case 2: consultarContaMenu(b); break;
            case 3: excluirContaMenu(b); break;
            case 4: {
                System.out.println(b.mostrarDados());
            }
            default:
        }
    }

    private void excluirContaMenu(Banco b) throws Exception {
        var c = recuperarConta(b);

        System.out.println("Deseja excluir esta conta? [S/N]");
        var resp = s.next();

        if (resp.equalsIgnoreCase("S")) {
            b.removerConta(c.getNumero());
            System.out.println("Conta excluída");
        } else {
            System.out.println("Operação cancelada");
        }

    }

    private void consultarContaMenu(Banco b) throws Exception {
        var conta = recuperarConta(b);
        menuConta(conta, b);
    }

    private Conta recuperarConta(Banco b) throws Exception {
        System.out.println("Insira o número da conta: ");
        var resp = s.nextInt();

        var conta = b.procurarConta(resp);

        System.out.println("Conta encontrada:\n" + ((Imprimivel) conta).mostrarDados());

        return conta;
    }

    private void menuConta(Conta conta, Banco banco) throws Exception {
        System.out.printf("""
                Escolha uma operação com a conta %d
                (a) Depositar
                (b) Sacar
                (c) Transferir
                """, conta.getNumero());

        var resp = s.next();

        System.out.print("Qual o valor? ");
        var valor = s.nextDouble();

        switch (resp) {
            case "a":
                conta.depositar(valor);
                System.out.println("Depósito realizado.");
                break;
            case "b":
                conta.sacar(valor);
                System.out.println("Saque realizado");
                break;
            case "c": menuTransferencia(conta, banco, valor);
            default:
        }
    }

    private void menuTransferencia(Conta origem, Banco banco, double valor) throws Exception {
        System.out.println("## Conta de destino");
        var destino = recuperarConta(banco);

        System.out.println();
        origem.sacar(valor);
        destino.depositar(valor);
        System.out.println("Transferência concluída.");
    }


    private void criarContaMenu(Banco b) {

        Conta contaCriada = null;

        System.out.println("Conta poupança ou corrente? (P/C)");
        var resp = s.next();

        System.out.println("Escolha um número para a conta");
        var numero = s.nextInt();

        if (resp.equalsIgnoreCase("P")) {

            System.out.println("Qual o limite?");
            var limite = s.nextDouble();
            contaCriada = new ContaPoupanca(numero, limite);

        }
        else if (resp.equalsIgnoreCase("C")) {

            System.out.println("Qual a taxa de operação");
            var taxa = s.nextDouble();
            contaCriada = new ContaCorrente(numero, taxa);

        }

        b.inserirConta(contaCriada);

        System.out.println("Conta criada!");
    }

    private Scanner s = new Scanner(System.in);
}

