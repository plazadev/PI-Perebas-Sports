package pi.conexao;

import java.sql.Connection;


public class TesteConexao {
   
    private static Connection con = null;
    
    public static void main(String[] args){
        try{
            con = Conexao.getConnection();
            
            System.out.println("Concetado");
        }catch(Exception e){
            e.printStackTrace();
            
        }finally{
            try{
                con.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
}
