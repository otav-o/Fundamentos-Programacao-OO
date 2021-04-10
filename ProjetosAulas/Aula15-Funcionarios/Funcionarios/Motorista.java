
public class Motorista extends Funcionario implements ISindicato, IInsalubridade
{
    private int kmPercorrido;
    private double precoPorKm;
    private boolean temPedagio;

    public int getKmPercorrido() {
        return kmPercorrido;
    }

    public void setKmPercorrido(int kmPercorrido) {
        this.kmPercorrido = kmPercorrido;
    }

    public double getPrecoPorKm() {
        return precoPorKm;
    }

    public void setPrecoPorKm(double precoPorKm) {
        this.precoPorKm = precoPorKm;
    }

    public boolean isTemPedagio() {
        return temPedagio;
    }

    public void setTemPedagio(boolean temPedagio) {
        this.temPedagio = temPedagio;
    }

    @Override
    public double salario(){
        return (kmPercorrido * precoPorKm) + ((temPedagio)?100:0) ;
    }
    
    
    @Override
    public double valorSindacato(){
       return salario() * 0.01;   
    }
    
    @Override
    public double valorInsalubridade(){
         return salario() * 0.05; 
    }
     
    
}
