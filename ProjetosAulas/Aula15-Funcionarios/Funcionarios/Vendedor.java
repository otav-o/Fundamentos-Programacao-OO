
public class Vendedor extends Funcionario
{
    private double valorVendas;
    
    
    
    @Override
    public double salario(){
        return valorVendas * 0.02;
    }
    
}
