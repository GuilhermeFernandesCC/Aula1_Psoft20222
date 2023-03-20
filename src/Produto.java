import java.util.UUID;

public class Produto {
    private String id;
    private String Nome;
    private String Fabricante;
    private Double Preco;

    public Produto(String nome,String fab,Double preco){
        this.id = UUID.randomUUID().toString();
        this.Nome = nome;
        this.Fabricante = fab;
        this.Preco = preco;
    }

    public String getId() {
        return id;
    }
}
