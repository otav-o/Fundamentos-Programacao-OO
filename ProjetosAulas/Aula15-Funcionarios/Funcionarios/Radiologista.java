
public class Radiologista extends Funcionario implements IInsalubridade
{
    
    
    @Override
    public double salario(){
        return 0;
    }

    
    @Override
    public double valorInsalubridade(){
         return salario() * 0.05; 
    }
}
