
public class Motorista extends Funcionario implements ISindicato, IInsalubridade
{
    private int kmPercorrido;
    private double precoPorKm;
    private boolean temPedagio;
    
    
    
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
