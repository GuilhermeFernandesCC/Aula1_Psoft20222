import java.sql.Date;

public class Lote {
    private Produto produto;
    private int quantidade;
    private Date validade;

    public Lote(Produto produto,int qtd, Date validade){
        this.produto = produto;
        this.quantidade = qtd;
        this.validade = validade;
    }
}
