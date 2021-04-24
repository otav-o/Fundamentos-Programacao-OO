public class Hexadecimal extends BaseNumerica {
    public Hexadecimal(int decimal) {
        this.decimal = decimal;
    }

    public String getResultado() {
        int resultado = decimal;
        String hexa = "";
        do {
            hexa += getAlgarismo(resultado % 16);
            resultado /= 16;
        } while (resultado != 0);

        return new StringBuilder(hexa).reverse().toString();
    }

    private String getAlgarismo(int n) {
        switch (n) {
            case 10: return "A";
            case 11: return "B";
            case 12: return "C";
            case 13: return "D";
            case 14: return "E";
            case 15: return "F";
            default: return Integer.toString(n);
        }
    }
}
