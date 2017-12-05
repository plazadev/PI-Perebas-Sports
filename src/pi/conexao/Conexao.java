package pi.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexao {
    
    private static Connection c = null;
    
    public static Connection getConnection() {
     
        Connection connection = null;
        try {
          
            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=Teste1" ;
           
            Properties properties = new Properties();
            properties.put("db_driver","com.microsoft.jdbc.sqlserver.SQLServerDriver");
            properties.put("user","sa");
            properties.put("password","1234" );
            //Realiza a conexão com o banco
            connection = DriverManager.getConnection(dbURL, properties);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        //Retorna a conexão
        return connection;
    }
    
}
