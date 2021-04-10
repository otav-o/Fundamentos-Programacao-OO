
public class Principal
{
    
    
    public static void main(String args[]){
        
        
        Funcionario fun = new Professor();
    
        System.out.println( fun.salario() );
            
        System.out.println( ( (Professor) fun).valorSindacato() );
        
        
        
        ISindicato sind = new Professor();
        
        System.out.println( ((Professor)sind).salario() );
        
        System.out.println( sind.valorSindacato() );
        
        //        
        Professor prof = new Professor();
        
        System.out.println( prof.salario() );
        
        System.out.println( prof.valorSindacato() );
        
        
    }
    
    
}
