import java.sql.Date;
import java.util.Arrays;

public class Cliente {
    private static Fachada fachada = new Fachada();
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fachada.listarProdutos()));

        fachada.addProduto("Leite","Mimosa",6.50);

        System.out.println(Arrays.toString(fachada.listarProdutos()));

        Date validade = new Date(2023,9,23);
        fachada.addLote(fachada.listarProdutos()[0],25,validade);
    }
}
