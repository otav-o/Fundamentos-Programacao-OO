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
        direcionarMenu(resp, banco);

        if (resp != 5) resp = menu(banco);
        return resp;
    }

    private void direcionarMenu(int resp, Banco b) {
        switch (resp) {
            case 1: criarContaMenu(b); break;
            case 2: consultarContaMenu(b); break;
            /*
            case 3: excluirContaMenu(b); break;
            case 4: relatorioBanco(b); break;
            */
            default:
        }
    }

    private void consultarContaMenu(Banco b) {
        System.out.println("Insira o número da conta: ");
        var resp = s.nextInt();
        var conta = b.procurarConta(resp);
        // verificar se conta existe
        System.out.println("Conta encontrada:\n" + ((Imprimivel) conta).mostrarDados());

        menuConta(conta);

    }

    private void menuConta(Conta conta) {
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
            case "a": conta.depositar(valor); break;
            case "b": conta.sacar(valor); break;
            // case "c":
            default:
        }
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

        b.inserirConta(contaCriada); // quebrar este método em outros
    }

    private Scanner s = new Scanner(System.in);
}

