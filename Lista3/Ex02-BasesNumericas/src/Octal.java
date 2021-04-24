public class Octal extends BaseNumerica{
    public Octal(int decimal) {
        this.decimal = decimal;
    }

    public String getOctal() {
        int resultado = decimal;
        String octal = "";
        do {
            octal += resultado % 8;
            resultado /= 8;
        } while (resultado != 0);

        return new StringBuilder(octal).reverse().toString();
    }
}
