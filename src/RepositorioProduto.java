import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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
}
