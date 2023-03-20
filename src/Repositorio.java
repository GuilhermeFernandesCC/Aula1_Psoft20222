import java.util.Map;

public class Repositorio {
    private Map<String,Produto> produtos ;
    public void addProduto(Produto p){
        produtos.put(p.getId(),p);
    }
}
