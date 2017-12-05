package pi.Validacao;


import pi.Encapsular.EncapsularClientes;
import pi.Erros.ErrosClientes;


public class ValidacaoClientes {
    
     public static  void validar(EncapsularClientes cliente) throws ErrosClientes {
       
        if (cliente == null) {
            throw new ErrosClientes("Nenhum cliente encontrado!!");
        }
          if ("".equals(cliente.getId_cliente())) {
            throw new ErrosClientes("Digite o código do cliente!");
        }
        if (cliente.getNm_cliente() == null || "".equals(cliente.getNm_cliente())) {
            throw new ErrosClientes("Digite o nome do cliente!");
        }
         if (cliente.getSexo() == null || "".equals(cliente.getSexo())
                || (!cliente.getSexo().equals("Masculino"))
                && !cliente.getSexo().equals("Feminino")
                && !cliente.getSexo().equals("Outro")) {
            throw new ErrosClientes("Selecione o gênero do cliente!");
        }
         
        if ( "".equals(cliente.getCpf())) {
            throw new ErrosClientes("Digite o cpf do cliente!");
        }
        if (cliente.getEndereco() == null || "".equals(cliente.getEndereco())) {
            throw new ErrosClientes("Digite o endereço do cliente!");
        }
        if (cliente.getEndereco() == null || "".equals(cliente.getEndereco())) {
            throw new ErrosClientes("Digite o endereço do cliente!");
        }
         if ("".equals(cliente.getCep())) {
            throw new ErrosClientes("Digite o CEP do Cliente");
        }
        if (cliente.getBairro() == null || "".equals(cliente.getBairro())) {
            throw new ErrosClientes("Digite o bairro do cliente!");
        }
         if (cliente.getCidade() == null || "".equals(cliente.getCidade())) {
            throw new ErrosClientes("Digite a cidade do cliente!");
        }
          if (cliente.getEndereco() == null || "".equals(cliente.getEndereco())) {
            throw new ErrosClientes("Digite o endereço do cliente!");
        }
          
         if (cliente.getEmail() == null || "".equals(cliente.getEmail())) {
            throw new ErrosClientes("Digite o email do cliente!");
        }
          if ("".equals(cliente.getTelefone())) {
            throw new ErrosClientes("Digite o Telefone do cliente!");
        }
         
       
    }
    
}
