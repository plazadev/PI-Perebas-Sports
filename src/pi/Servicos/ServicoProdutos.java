package pi.Servicos;


import pi.Validacao.ValidacaoProdutos;
import pi.Encapsular.EncapsularProdutos;
import pi.Erros.ErrosBD;
import pi.Erros.ErrosProdutos;
import pi.Metodos.MetodosProdutos;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ServicoProdutos {
    private static final ServicoProdutos INSTANCE = new ServicoProdutos();

    private ServicoProdutos() {
        
    }
    
    public static ServicoProdutos getInstance() {
        return INSTANCE;
    }
      public void cadastrarProdutos(EncapsularProdutos produto)
            throws ErrosProdutos, ErrosBD {
        ValidacaoProdutos.validar(produto);

        try {
           
            MetodosProdutos.cadastrar(produto);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ErrosBD("Erro na fonte de dados", e);
        }
    }
     public void atualizarProdutos(EncapsularProdutos produto)
            throws ErrosProdutos, ErrosBD {
        
        //Chama o validador para verificar o cliente
        ValidacaoProdutos.validar(produto);

        try {
            //Realiza a chamada de atualização na fonte de dados
            MetodosProdutos.atualizar(produto);
            return;
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new ErrosBD("Erro na fonte de dados", e);
        }
    }
      
      public static void deletar(int id){
        try {
            MetodosProdutos.deletar(id);
        } catch (Exception e) {
        }
    }
      
      public List<EncapsularProdutos> procurar(String nome)
            throws ErrosProdutos, ErrosBD {
        try {
            //Verifica se um parâmetro de pesquisa não foi informado.
            //Caso afirmativo, realiza uma listagem simples do DAO.
            //Caso contrário, realiza uma pesquisa com o parâmetro
            if (nome == null || "".equals(nome)) {
                return MetodosProdutos.listar();
            } else {
                return MetodosProdutos.procurar(nome);
            }
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new ErrosBD("Erro na fonte de dados", e);
        }
    }
      public EncapsularProdutos obterProduto(Integer id)
            throws ErrosProdutos, ErrosBD {
        try {
            //Retorna o cliente obtido com o DAO
            return MetodosProdutos.obterProduto(id);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new ErrosBD("Erro na fonte de dados", e);
        }
    }
      public static ArrayList<EncapsularProdutos> ListarProdutos() throws SQLException{
        
        try{
            return MetodosProdutos.listarProduto();
        }catch(Exception e){
            System.err.println(e);
        }
        
        return null;
    }
}
