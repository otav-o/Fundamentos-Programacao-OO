import Contas.*;

public class Executavel {
    public Executavel() {}

    public void Executar() {
        Conta cc = new ContaCorrente(100, 2.5);
        Conta cp = new ContaPoupanca(150, 2000.00);

        cc.depositar(45);
        cp.depositar(50);

        cc.sacar(30);
        cp.sacar(300);

        System.out.println(Relatorio.gerarRelatorio((Imprimivel) cc));
        System.out.println(Relatorio.gerarRelatorio((Imprimivel) cp));
    }
}

