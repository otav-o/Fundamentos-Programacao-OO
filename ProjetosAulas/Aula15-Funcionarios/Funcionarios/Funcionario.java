
public abstract class Funcionario
{
    private String nome;
    private int tempoCasa;
    private int numeroFilhos;
    private ICargo cargo;
    
    public Funcionario(){
        
    }

    public Funcionario(String nome, int tempoCasa, int numeroFilhos) {
        this.nome = nome;
        this.tempoCasa = tempoCasa;
        this.numeroFilhos = numeroFilhos;
    }

    public abstract double salario();
    
    public int quinquenio(){
       return tempoCasa / 5;   
    }
    
    public double bonusPorCargo(){
      return salario() * cargo.getBonus();   
    }
          
    public double inss(){
       return salario() * 0.13;   
    }  
    
    public void setNome(String nome){
      this.nome = nome;
    }
    public String getNome(){
      return nome;   
    }
    public void setTempoCasa(int tempoCasa){
      this.tempoCasa = tempoCasa;
    }
    public int getTempoCasa(){
      return tempoCasa;   
    }
    public void setNumeroFilhos(int numeroFilhos){
      this.numeroFilhos = numeroFilhos;
    }
    public int getNumeroFilhos(){
      return numeroFilhos;   
    }
    public void setCargo(ICargo cargo){
      this.cargo = cargo;
    }
    public ICargo getCargo(){
      return cargo;   
    }
    
}
