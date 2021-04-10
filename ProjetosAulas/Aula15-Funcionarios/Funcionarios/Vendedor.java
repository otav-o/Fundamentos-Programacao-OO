
public class Vendedor extends Funcionario
{
    private double valorVendas;
    
    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }
    public double getValorVendas() {
        return valorVendas;
    }
    
    @Override
    public double salario(){
        return valorVendas * 0.02;
    }
    
}
