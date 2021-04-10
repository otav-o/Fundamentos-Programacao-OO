
import java.util.Scanner;
import java.util.ArrayList;

public class Principal2
{
    
    public static void main(String args[]){
     
        Scanner le = new Scanner(System.in);
        
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        
        while(true){
         int menu = menu();   
         
         if (menu == 5){
           break;    
         }else if (menu == 1){
             
             funcionarios.add( cadastrarFuncionario() ); 
         } else if (menu == 3) {
             listarSindicalizados(funcionarios);
         }
            
            
        }
        
        
    }

    private static void listarSindicalizados(ArrayList<Funcionario> funcionarios) {
        System.out.println("## Funcionários sindicalizados: ");
        for (Funcionario f : funcionarios)
            if (f instanceof ISindicato)
                System.out.println(f.getNome());
    }

    public static Funcionario cadastrarFuncionario(){
        Scanner le = new Scanner(System.in);
        System.out.println("############### CADASTRAR FUNCIONARIO #############");
        System.out.println("## Escolha o tipo: (P)rofessor, (M)otorista, "+
        " (V)endedor ou (R)adiologista");
        String tipo = le.next();
        Funcionario func = null;
        if (tipo.equalsIgnoreCase("p")){
            func = new Professor();
        } else if (tipo.equalsIgnoreCase("m")){
            func = new Motorista();
        } else if (tipo.equalsIgnoreCase("v")){
            func = new Vendedor();
        } else {
            func = new Radiologista();
        } 
        System.out.print("## Nome :");
        le.nextLine();//Gambiarra - POG
        func.setNome( le.nextLine() );
        System.out.print("## Tempo de Casa :");
        func.setTempoCasa( le.nextInt() );
        System.out.print("## Numero Filhos :");
        func.setNumeroFilhos( le.nextInt() );
        System.out.print("## Posui Cargo? (S)im (N)ao :");
        func.setCargo( le.next().equalsIgnoreCase("s")? new Cargo(): new Funcao() );
        
        if ( func instanceof Professor){
            System.out.print("## Numero de Aulas :");
            ((Professor)func).setNumeroAula( le.nextInt() );
            System.out.print("## Valor Hora :");
            ((Professor)func).setValorHora( le.nextDouble() );
        } else
        if ( func instanceof Motorista){
            System.out.print("## Quilômetros percorridos :");
            ((Motorista)func).setKmPercorrido( le.nextInt() );
            System.out.print("## Preço por km :");
            ((Motorista)func).setPrecoPorKm( le.nextDouble() );
            System.out.print("## Tem pedágio? (S/N) :");
            ((Motorista)func).setTemPedagio( le.next().equalsIgnoreCase("s")); // já valeu o ponto extra
        } else
        if ( func instanceof Vendedor){
            System.out.print("## Valor de vendas :");
            ((Vendedor)func).setValorVendas( le.nextDouble() );
        }
        
        
             
                
        return func;
    }
    
    public static int menu(){
        Scanner le = new Scanner(System.in);
        System.out.println("############### MENU #############");
        System.out.println("## 1) Cadastrar Funcionario");
        System.out.println("## 2) Listar Funcionarios ");
        System.out.println("## 3) Listar Funcionarios Sindicalizados ");
        System.out.println("## 4) Editar Funcionario");
        System.out.println("## 5) Sair ");
        
        return le.nextInt();
    }
    
}
