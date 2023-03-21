import java.sql.Date;
import java.util.Collection;

public class LoteServices {
    private RepositorioProduto repositorioProduto = new RepositorioProduto();
    private RepositorioLote repositorioLote = new RepositorioLote();
    public String addLote(String prodID, int quantidade, Date dataValidade){
        Lote novoLote = new Lote(prodID,quantidade,dataValidade);
        repositorioLote.saveLote(novoLote);
        return novoLote.getId();
    }

    public Collection<Lote> listarLotes(){
        return repositorioLote.getAllLotes();
    }
}
