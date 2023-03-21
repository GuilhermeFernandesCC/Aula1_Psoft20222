public class ProdutoServices {
    private RepositorioProduto repositorioProduto = new RepositorioProduto();
    private RepositorioLote repositorioLote = new RepositorioLote();

    public String addProduto(String nome,String fabricante, double preco){
        Produto novoProduto = new Produto(nome,fabricante,preco);
        repositorioProduto.saveProduto(novoProduto);
        return novoProduto.getId();
    }

    public String[] listarProdutos(){
        return repositorioProduto.getAllProdutoID();
    }
}
