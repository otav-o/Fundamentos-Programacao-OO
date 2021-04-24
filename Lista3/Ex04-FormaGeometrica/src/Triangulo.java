public class Triangulo implements IFormaGeometrica {

    public Triangulo(double l1, double l2, double l3) {
        lado1 = l1; lado2 = l2; lado3 = l3;
    }

    @Override
    public double area() {
        double p = comprimento() / 2; // semiperímetro
        return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3)); // Fórmula de Heron
    }

    @Override
    public double comprimento() {
        return lado1 + lado2 + lado3;
    }

    private final double lado1;
    private final double lado2;
    private final double lado3;
}
