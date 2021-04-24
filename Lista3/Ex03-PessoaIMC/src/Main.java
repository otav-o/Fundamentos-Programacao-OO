public class Main {

    public static void main(String[] args) {
	    Pessoa h1 = new Homem(64, 1.72);
        System.out.println(h1.toString());
        System.out.println(((PessoaIMC) h1).resultIMC() + " " + ((PessoaIMC) h1).calculaIMC());

        Mulher m1 = new Mulher(52, 1.60);
        System.out.println(m1); // não precisa do toString()
        System.out.println(m1.resultIMC() + " " + m1.calculaIMC());
    }
}
