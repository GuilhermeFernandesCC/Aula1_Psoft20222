import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class RepositorioLote {
    private Map<String,Lote> lotes;

    public RepositorioLote(){
        this.lotes = new HashMap<String,Lote>();
    }

    public String saveLote(Lote l){
        lotes.put(l.getId(),l);
        return l.getId();
    }

    public Collection<Lote> getAllLotes(){
        return lotes.values();
    }
}
