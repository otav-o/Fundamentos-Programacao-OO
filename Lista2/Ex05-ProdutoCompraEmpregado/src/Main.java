/*
    "Implemente o diagrama de classes abaixo"
 */

import Compra.Compra;
import Compra.Endereco;
import Compra.Pessoa;
import Compra.Produto;

public class Main {

    public static void main(String[] args) {
	    testarCompras();
    }

    private static void testarCompras() {
        var e1 = new Endereco("Av. dos Andradas", "Juiz de Fora", "MG");
        var e2 = new Endereco("Rua do bicho", "Rio Branco", "AC");
        var e3 = new Endereco("Rua Costa e Silva", "Brasília", "DF");

        var p1 = new Pessoa("Miriã", e1, "10");
        var p2 = new Pessoa("Ricardo", e2, "11");
        var p3 = new Pessoa("Fernanda", e2, "12");
        var p4 = new Pessoa("Jovercino", e3, "15");

        var prod1 = new Produto(123456789, "Curso de culinária");
        var prod2 = new Produto(987654321, "Curso de tiro");
        var prod3 = new Produto(100000000, "Panela de arroz");
        var prod4 = new Produto(111111111, "Notebook Positivo");
        var prod5 = new Produto(222222222, "Lixeira para o notebook Positivo");


        var c1 = new Compra(p1, prod2);
        var c2 = new Compra(p2, prod1);
        var c3 = new Compra(p3, prod3);
        var c4 = new Compra(p4, prod4);
        var c5 = new Compra(p4, prod5);

        System.out.println(c1.verificarCompra());
        System.out.println(c4.verificarCompra());
        System.out.println(c5.verificarCompra());

    }
}
