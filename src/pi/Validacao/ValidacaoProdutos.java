package pi.Validacao;


import pi.Encapsular.EncapsularProdutos;
import pi.Erros.ErrosProdutos;


public class ValidacaoProdutos {
    
     public static  void validar(EncapsularProdutos produto) throws ErrosProdutos {
       
        if (produto == null) {
            throw new ErrosProdutos("Nenhum Protuto encontrado!!");
        }
          if ("".equals(produto.getCod_produto())) {
            throw new ErrosProdutos("Digite o código do Produto!");
        }
        if (produto.getNm_produto() == null || "".equals(produto.getNm_produto())) {
            throw new ErrosProdutos("Digite o nome do Produtos!");
        }
         if (produto.getCategoria() == null || "".equals(produto.getCategoria())
                || (!produto.getCategoria().equals("Masculino"))
                && !produto.getCategoria().equals("Feminino")
                && !produto.getCategoria().equals("Infantil")) {
            throw new ErrosProdutos("Selecione uma categoria do produto!");
        }
         
        if ( "".equals(produto.getPreco())) {
            throw new ErrosProdutos("Digite o preço do produto!");
        }
          if ( "".equals(produto.getQtde())) {
            throw new ErrosProdutos("Digite a quantidade de produtos!");
        }
            if ( "".equals(produto.getTamanho())) {
            throw new ErrosProdutos("Digite o tamanho do produto!");
        }
            
         if (produto.getCor() == null || "".equals(produto.getCor())) {
            throw new ErrosProdutos("Digite a cor do produto!");
        }
         if (produto.getDescricao() == null || "".equals(produto.getDescricao())) {
            throw new ErrosProdutos("Digite a descrição do produto!");
        }
       
       
    }

    
}
