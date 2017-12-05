package pi.Metodos;


import pi.Encapsular.EncapsularProdutos;
import pi.conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MetodosProdutos {

    public static void cadastrar(EncapsularProdutos produto) throws SQLException, Exception {

        String sql = "INSERT INTO [dbo].PI_PRODUTO (cod_produto,nm_produto, categoria, preco, qtde, tamanho, cor, descricao)"
                + "values (?, ?, ?, ?, ?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = Conexao.getConnection();

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, produto.getCod_produto());
            preparedStatement.setString(2, produto.getNm_produto());
            preparedStatement.setString(3, produto.getCategoria());
            preparedStatement.setFloat(4, produto.getPreco());
            preparedStatement.setInt(5, produto.getQtde());
            preparedStatement.setInt(6, produto.getTamanho());
            preparedStatement.setString(7, produto.getCor());
            preparedStatement.setString(8, produto.getDescricao());

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

    public static void atualizar(EncapsularProdutos produto)
            throws SQLException, Exception {

        String sql = "UPDATE [dbo].PI_PRODUTO SET cod_produto=?, nm_produto=?, categoria=?, preco=?,qtde=?, tamanho=?,cor=?, descricao=?"
                + "WHERE (cod_produto=?)";

        Connection connection = null;

        PreparedStatement preparedStatement = null;

        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, produto.getCod_produto());
        preparedStatement.setString(2, produto.getNm_produto());
        preparedStatement.setString(3, produto.getCategoria());
        preparedStatement.setFloat(4, produto.getPreco());
        preparedStatement.setInt(5, produto.getQtde());
        preparedStatement.setInt(6, produto.getTamanho());
        preparedStatement.setString(7, produto.getCor());
        preparedStatement.setString(8, produto.getDescricao());

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

    public static void deletar(Integer cod) throws SQLException, Exception {

        String sql = "UPDATE pi_produto SET status=? WHERE (cod_produto=?)";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {

            connection = Conexao.getConnection();

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setBoolean(1, false);
            preparedStatement.setInt(2, cod);

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

    public static List<EncapsularProdutos> listar()
            throws SQLException, Exception {
        //Monta a string de listagem de clientes no banco, considerando
        //apenas a coluna de ativação de clientes ("enabled")
        String sql = "SELECT * FROM cliente WHERE (enabled=?)";
        //Lista de clientes de resultado
        List<EncapsularProdutos> listaProduto = null;
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        //Armazenará os resultados do banco de dados
        ResultSet result = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = Conexao.getConnection();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setBoolean(1, true);

            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();

            //Itera por cada item do resultado
            while (result.next()) {
                //Se a lista não foi inicializada, a inicializa
                if (listaProduto == null) {
                    listaProduto = new ArrayList<EncapsularProdutos>();
                }
                //Cria uma instância de Cliente e popula com os valores do BD
                EncapsularProdutos produto = new EncapsularProdutos();
                produto.setCod_produto(result.getInt("cod_produto"));
                produto.setNm_produto(result.getString("nm_produto"));
                produto.setCategoria(result.getString("categoria"));
                produto.setPreco(result.getFloat("preco"));
                produto.setTamanho(result.getInt("tamanho"));
                produto.setCor(result.getString("cor"));
                produto.setDescricao(result.getString("descricao"));
                produto.setQtde(result.getInt("quantidade"));
                //Adiciona a instância na lista
                listaProduto.add(produto);
            }
        } finally {
            //Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        //Retorna a lista de clientes do banco de dados
        return listaProduto;
    }

    public static List<EncapsularProdutos> procurar(String nome)
            throws SQLException, Exception {
        //Monta a string de consulta de clientes no banco, utilizando
        //o valor passado como parâmetro para busca nas colunas de
        //nome ou sobrenome (através do "LIKE" e ignorando minúsculas
        //ou maiúsculas, através do "UPPER" aplicado à coluna e ao
        //parâmetro). Além disso, também considera apenas os elementos
        //que possuem a coluna de ativação de clientes configurada com
        //o valor correto ("enabled" com "true")
        String sql = "SELECT * FROM PI_PRODUTO WHERE nm_produto";
        //Lista de clientes de resultado
        List<EncapsularProdutos> listaProdutos = null;
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        //Armazenará os resultados do banco de dados
        ResultSet result = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = Conexao.getConnection();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setString(1, "%" + nome + "%");
            preparedStatement.setString(2, "%" + nome + "%");
            preparedStatement.setString(3, "%" + nome + "%");
            preparedStatement.setString(4, "%" + nome + "%");
            preparedStatement.setString(5, "%" + nome + "%");
            preparedStatement.setString(6, "%" + nome + "%");
            preparedStatement.setString(7, "%" + nome + "%");
            preparedStatement.setString(8, "%" + nome + "%");
//            preparedStatement.setBoolean(3, true);

            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();

            //Itera por cada item do resultado
            while (result.next()) {
                //Se a lista não foi inicializada, a inicializa
                if (listaProdutos == null) {
                    listaProdutos = new ArrayList<EncapsularProdutos>();
                }
                //Cria uma instância de Cliente e popula com os valores do BD
                EncapsularProdutos produto = new EncapsularProdutos();
                produto.setCod_produto(result.getInt("cod_produto"));
                produto.setNm_produto(result.getString("nm_produto"));
                produto.setCategoria(result.getString("categoria"));
                produto.setPreco(result.getFloat("preco"));
                produto.setQtde(result.getInt("quantidade"));
                produto.setTamanho(result.getInt("tamanho"));
                produto.setCor(result.getString("cor"));
                produto.setDescricao(result.getString("descricao"));

                //Adiciona a instância na lista
                listaProdutos.add(produto);
            }
        } finally {
            //Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        //Retorna a lista de clientes do banco de dados
        return listaProdutos;
    }

    public static EncapsularProdutos obterProduto(Integer id)
            throws SQLException, Exception {
        //Compõe uma String de consulta que considera apenas o cliente
        //com o ID informado e que esteja ativo ("enabled" com "true")
        String sql = "SELECT * FROM pi_produto WHERE (cod_produto=?)";

        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        //Armazenará os resultados do banco de dados
        ResultSet result = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = Conexao.getConnection();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setInt(1, id);
            preparedStatement.setBoolean(2, true);

            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();

            //Verifica se há pelo menos um resultado
            if (result.next()) {
                //Cria uma instância de Cliente e popula com os valores do BD
                EncapsularProdutos produto = new EncapsularProdutos();
                produto.setCod_produto(result.getInt("cod_produto"));
                produto.setNm_produto(result.getString("nm_produto"));
                produto.setCategoria(result.getString("categoria"));
                produto.setPreco(result.getFloat("preco"));
                produto.setQtde(result.getInt("quantidade"));
                produto.setTamanho(result.getInt("tamanho"));
                produto.setCor(result.getString("cor"));
                produto.setDescricao(result.getString("descricao"));

                //Retorna o resultado
                return produto;
            }
        } finally {
            //Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }

        //Se chegamos aqui, o "return" anterior não foi executado porque
        //a pesquisa não teve resultados
        //Neste caso, não há um elemento a retornar, então retornamos "null"
        return null;
    }
    
    public static ArrayList<EncapsularProdutos> listarProduto() throws SQLException {
        
        ArrayList<EncapsularProdutos> listaProduto = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = Conexao.getConnection();
            
            String sql = "SELECT TOP 1000 [cod_produto]\n"
                    + "      ,[nm_produto]\n"
                    + "      ,[categoria]\n"
                    + "      ,[tamanho]\n"
                    + "      ,[cor]\n"
                    + "      ,[preco]\n"
                    + "      ,[descricao]\n"
                    + "      ,[quantidade]\n" 
                    + "      ,[status]\n"
                    + "  FROM [teste1].[dbo].[PI_PRODUTO] where status = 1;";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            
            while (result.next()) {
                
                EncapsularProdutos produto = new EncapsularProdutos();
                produto.setCod_produto(result.getInt("cod_produto"));
                produto.setNm_produto(result.getString("nm_produto"));
                produto.setCategoria(result.getString("categoria"));
                produto.setPreco(result.getFloat("preco"));
                produto.setQtde(result.getInt("quantidade"));
                produto.setTamanho(result.getInt("tamanho"));
                produto.setCor(result.getString("cor"));
                produto.setDescricao(result.getString("descricao"));           
                                                 
                listaProduto.add(produto);
            }
            
        } catch (Exception e) {
            
        } finally {
            connection.close();
        }
        
        return listaProduto;
    }
    
}
