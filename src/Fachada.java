public class Fachada {
    private LoteServices loteServices = new LoteServices();
    private ProdutoServices produtoServices = new ProdutoServices();

    public String adaProduto(String nome,String fabricante,double preco){
        return produtoServices.addProduto(nome,fabricante,preco);
    }

    public String[] listarProdutos(){
        return produtoServices.listarProdutos();
    }
}
