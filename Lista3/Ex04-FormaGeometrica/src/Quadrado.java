public class Quadrado implements IFormaGeometrica {

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double comprimento() {
        return 4 * lado;
    }

    private double lado;
}
