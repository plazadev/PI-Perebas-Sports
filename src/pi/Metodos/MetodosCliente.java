package pi.Metodos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import pi.Encapsular.EncapsularClientes;
import pi.conexao.Conexao;

public class MetodosCliente {
    
    public static void cadastrar(EncapsularClientes cliente) throws SQLException, Exception {
        
        String sql = "insert into [dbo].[PI_CLIENTE]\n"
                + " (id_cliente, nm_cliente, sexo, cpf, data_nasc,endereco, complemento, "
                + "cep, bairro, cidade, estado, email, telefone, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = Conexao.getConnection();
            
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, cliente.getId_cliente());
            preparedStatement.setString(2, cliente.getNm_cliente());
            preparedStatement.setString(3, cliente.getSexo());
            preparedStatement.setString(4, cliente.getCpf());
            Timestamp t = new Timestamp(cliente.getData_nasc().getTime());
            preparedStatement.setTimestamp(5, t);
            preparedStatement.setString(6, cliente.getEndereco());
            preparedStatement.setString(7, cliente.getComplemento());
            preparedStatement.setString(8, cliente.getCep());
            preparedStatement.setString(9, cliente.getBairro());
            preparedStatement.setString(10, cliente.getCidade());
            preparedStatement.setString(11, cliente.getEstado());
            preparedStatement.setString(12, cliente.getEmail());
            preparedStatement.setString(13, cliente.getTelefone());
            preparedStatement.setBoolean(14, true);
            
            preparedStatement.execute();
        } finally {
            
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }
    
    public static void atualizar(EncapsularClientes cliente)
            throws SQLException, Exception {
        
        String sql = "UPDATE id_cliente =?, nm_cliente=?, sexo=?, cpf=?, data_nasc=?,endereco=?, complemento=?"
                + "cep=?, bairro=?, cidade=?, estado=?, email=?, telefone=?, status=?) WHERE (id_cliente=?)";;
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, cliente.getId_cliente());
        preparedStatement.setString(2, cliente.getNm_cliente());
        preparedStatement.setString(3, cliente.getSexo());
        preparedStatement.setString(4, cliente.getCpf());
        Timestamp t = new Timestamp(cliente.getData_nasc().getTime());
        preparedStatement.setTimestamp(5, t);
        preparedStatement.setString(6, cliente.getComplemento());
        preparedStatement.setString(7, cliente.getCep());
        preparedStatement.setString(8, cliente.getBairro());
        preparedStatement.setString(9, cliente.getCidade());
        preparedStatement.setString(10, cliente.getEstado());
        preparedStatement.setString(11, cliente.getEmail());
        preparedStatement.setString(12, cliente.getTelefone());
        preparedStatement.setBoolean(13, true);
        
        try {
            
            connection = Conexao.getConnection();
            
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.execute();
        } finally {
            
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }
    
    public static void Deletar(Integer id) throws SQLException, Exception {
        
        String sql = "UPDATE [PI_CLIENTE] SET [status]=? WHERE ([id_cliente]=?)";
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            
            connection = Conexao.getConnection();
            
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setBoolean(1, false);
            preparedStatement.setInt(2, id);
            
            preparedStatement.execute();
        } finally {
            
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
                {
                    if (connection != null && !connection.isClosed()) {
                        connection.close();
                    }
                }
            }
            
        }
        
    }
    
    public static ArrayList<EncapsularClientes> listarCliente() throws SQLException {
        
        ArrayList<EncapsularClientes> lista = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = Conexao.getConnection();
            
            String sql = "SELECT TOP 1000 [id_cliente]\n"
                    + "      ,[nm_cliente]\n"
                    + "      ,[sexo]\n"
                    + "      ,[cpf]\n"
                    + "      ,[data_nasc]\n"
                    + "      ,[endereco]\n"
                    + "      ,[complemento]\n"
                    + "      ,[cep]\n"
                    + "      ,[bairro]\n"
                    + "      ,[cidade]\n"
                    + "      ,[estado]\n"
                    + "      ,[email]\n"
                    + "      ,[telefone]\n"
                    + "      ,[status]\n"
                    + "  FROM [Esportes].[dbo].[PI_CLIENTE] where status = 1;";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            
            while (result.next()) {
                
                EncapsularClientes cliente = new EncapsularClientes();
                cliente.setId_cliente(result.getInt("id_cliente"));
                cliente.setNm_cliente(result.getString("nm_cliente"));
                cliente.setSexo(result.getString("sexo"));
                cliente.setCpf(result.getString("cpf"));
                cliente.setData_nasc(result.getDate("data_nasc"));
                cliente.setEndereco(result.getString("endereco"));
                cliente.setComplemento(result.getString("complemento"));
                cliente.setCep(result.getString("cep"));
                cliente.setBairro(result.getString("bairro"));
                cliente.setCidade(result.getString("cidade"));
                cliente.setEstado(result.getString("estado"));
                cliente.setEmail(result.getString("email"));
                cliente.setTelefone(result.getString("telefone"));
                
                lista.add(cliente);
            }
            
        } catch (Exception e) {
            
        } finally {
            connection.close();
        }
        
        return lista;
    }
}
