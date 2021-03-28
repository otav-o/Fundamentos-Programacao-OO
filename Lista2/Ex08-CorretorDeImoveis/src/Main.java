import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    var c = new Corretor("Carlos", 31);
	    cadastrarImoveis(c);
        System.out.println("Sua comissão: " + c.calcularComissaoTotal());
    }

    private static void cadastrarImoveis(Corretor c) {
        System.out.printf("Cadastro de imóveis - Corretor %s\n" +
                "---------------------\n", c.getNome());
        char resp;
        do {
            c.addImovel(retornarImovel());
            System.out.print("Deseja continuar? [S/N] ");
            resp = s.next().toCharArray()[0]; //.toUpperCase()[0];
        } while (resp != 'N' && resp != 'n');
    }

    private static Imovel retornarImovel() {
        System.out.print("Qual o preço do imóvel? ");
        double preco = s.nextDouble();

        System.out.print("Qual a comissão (em decimal)? ");
        double porcentagemComissao = s.nextDouble();

        System.out.print("Este imóvel é antigo? ");
        char resp = s.next().toCharArray()[0];

        if (resp == 'S' || resp == 's') {
            System.out.print("Digite o valor do desconto: "); double desconto = s.nextDouble();
            return new ImovelAntigo(retornarEndereco(), preco, porcentagemComissao, desconto);
        }
        return new Imovel(retornarEndereco(), preco, porcentagemComissao);
    }

    private static Endereco retornarEndereco() {
        System.out.print("Rua: "); String rua = s.next();
        System.out.print("Numero: "); int numero = s.nextInt();
        System.out.print("Complemento: "); int complemento = s.nextInt();
        System.out.print("Bairro: "); String bairro = s.next();
        System.out.print("Cidade: "); String cidade = s.next();
        return new Endereco(rua, numero, complemento, bairro, cidade);
    }

    private static Scanner s = new Scanner(System.in);
}
