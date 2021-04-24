public class Main {
/*
    Crie uma hierarquia de classes que converta um número decimal para outras bases, binaria,
    hexadecimal, octal, etc
*/
    public static void main(String[] args) {
	    Binario b = new Binario(150000);
        System.out.println(b.getResultado());

        Octal o = new Octal(164789);
        System.out.println(o.getResultado());

        Hexadecimal h = new Hexadecimal(1000);
        System.out.println(h.getResultado());

        var cincoMilEmBinario = new ConversaoGenerica(5000, 2);
        var cincoMilNaBase3 = new ConversaoGenerica(5000, 3);
        var cincoMilEmOctal = new ConversaoGenerica(5000, 8);
        var cincoMilEmDecimal = new ConversaoGenerica(5000, 10);

        System.out.println(cincoMilEmBinario.getResultado());
        System.out.println(cincoMilNaBase3.getResultado());
        System.out.println(cincoMilEmOctal.getResultado());
        System.out.println(cincoMilEmDecimal.getResultado());
    }
}
