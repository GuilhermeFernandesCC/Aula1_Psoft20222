import java.sql.Date;
import java.util.UUID;

public class Lote {
    private String id;
    private String produtoId;
    private int quantidade;
    private Date validade;

    public Lote(String prodID,int qtd, Date validade){
        this.id = UUID.randomUUID().toString();
        this.produtoId = prodID;
        this.quantidade = qtd;
        this.validade = validade;
    }

    public String getId() {
        return id;
    }
}
