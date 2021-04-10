
public class Professor extends Funcionario implements ISindicato
{
    private int numeroAula;
    private double valorHora;   
    
    
    @Override
    public double salario(){
        return numeroAula * valorHora + (100 * quinquenio());
    }
    
    @Override
    public double valorSindacato(){
       return salario() * 0.01;   
    }
         
    
    public void setNumeroAula(int numeroAula){
        this.numeroAula = numeroAula;
    }
    public int getNumeroAula(){
        return numeroAula;
    }
    
    public void setValorHora(double valorHora){
        this.valorHora = valorHora;
    }
    public double getValorHora(){
        return valorHora;
    }
}
