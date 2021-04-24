public class Binario extends BaseNumerica {

    public Binario(int decimal) {
        this.decimal = decimal;
    }

    public String getBinario() {
        int resultado = decimal;
        String bin = "";
        do {
            bin += resultado % 2;
            resultado /= 2;
        } while (resultado != 0);

        return new StringBuilder(bin).reverse().toString();
    }
}
