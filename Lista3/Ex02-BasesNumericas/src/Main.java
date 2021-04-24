public class Main {
/*
    Crie uma hierarquia de classes que converta um número decimal para outras bases, binaria,
    hexadecimal, octal, etc
*/
    public static void main(String[] args) {
	    Binario b = new Binario(150000);
        System.out.println(b.getBinario());

        Octal o = new Octal(164789);
        System.out.println(o.getOctal());
    }
}
