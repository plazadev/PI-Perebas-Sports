package pi.Servicos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import pi.Encapsular.EncapsularClientes;
import pi.Erros.ErrosBD;
import pi.Erros.ErrosClientes;
import pi.Metodos.MetodosCliente;
import pi.Validacao.ValidacaoClientes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinicius
 */
public class ServicoCliente {
     private static final ServicoCliente INSTANCE = new ServicoCliente();

    private ServicoCliente() {
        
    }
    
    public static ServicoCliente getInstance() {
        return INSTANCE;
    }
      public void cadastrarCliente(EncapsularClientes cliente)
            throws ErrosClientes, ErrosBD {
        ValidacaoClientes.validar(cliente);

        try {
           
            MetodosCliente.cadastrar(cliente);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ErrosBD("Erro na fonte de dados", e);
        }
    }
      
      
    public static ArrayList<EncapsularClientes> ListarItens() throws SQLException{
        
        try{
            return MetodosCliente.listarCliente();
        }catch(Exception e){
            System.err.println(e);
        }
        
        return null;
    }
    
    public static void Deletar(int id){
        try {
            MetodosCliente.Deletar(id);
        } catch (Exception e) {
        }
    }
    
}

 
    