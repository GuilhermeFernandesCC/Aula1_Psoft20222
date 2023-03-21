import java.util.*;

public class RepositorioProduto {
    private Map<String,Produto> produtos;

    public RepositorioProduto(){
        this.produtos = new HashMap<String,Produto>();
    }

    public String saveProduto(Produto p){
        produtos.put(p.getId(),p);
        return p.getId();
    }

    public Collection<Produto> getAllProdutos(){
        return produtos.values();
    }
    public String[] getAllProdutoID(){
        return produtos.keySet().toArray(new String[0]);
    }
}
