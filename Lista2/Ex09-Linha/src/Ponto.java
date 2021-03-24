import java.lang.Math;

public class Ponto {
    public Ponto (double abscissa, double ordenada) {
        this.abscissa = abscissa;
        this.ordenada = ordenada;
    }

    public double distanciaAte(Ponto p) {
        double distanciaAbscissas = this.abscissa - p.abscissa;
        double distanciaOrdenadas = this.ordenada - p.ordenada;
        double d = Math.sqrt(Math.pow(distanciaAbscissas, 2) + Math.pow(distanciaOrdenadas, 2));
        return d;
    }

    public double getAbscissa() {
        return abscissa;
    }

    public double getOrdenada() {
        return ordenada;
    }

    private double abscissa;
    private double ordenada;

}
