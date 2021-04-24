public class ConversaoGenerica extends BaseNumerica {

    public ConversaoGenerica(int decimal, int base) {
        this.decimal = decimal;
        this.base = base;
    }

    public String getResultado() {
        int numero = decimal;
        String novoNumero = "";
        do {
            novoNumero += numero % base;
            numero /= base;
        } while (numero != 0);

        return new StringBuilder(novoNumero).reverse().toString();
    }

    private int base;
}
