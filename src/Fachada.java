import java.sql.Date;

public class Fachada {
    private LoteServices loteServices = new LoteServices();
    private ProdutoServices produtoServices = new ProdutoServices();

    public String addProduto(String nome,String fabricante,double preco){
        return produtoServices.addProduto(nome,fabricante,preco);
    }

    public String[] listarProdutos(){
        return produtoServices.listarProdutos();
    }

    public String addLote(String prodID, int quant, Date validade ){
        return loteServices.addLote(prodID,quant,validade);
    }
}
