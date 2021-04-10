
public class Cargo implements ICargo
{
    private String nome;
    private double acrescimo;
    
    public Cargo(){
        
    }
    public Cargo(String nome, double acrescimo){
     this.nome = nome;
     this.acrescimo = acrescimo;
    }
        
    public void setNome(String nome){
      this.nome = nome;
    }
    public String getNome(){
      return nome;   
    }
    
    public double getBonus(){
       return 0.3;   
    }
    
    
    public void setAcrescimo(double acrescimo){
      this.acrescimo = acrescimo;
    }
    public double getAcrescimo(){
      return acrescimo;   
    }
}
