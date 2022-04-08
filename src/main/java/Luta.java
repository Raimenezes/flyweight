import java.util.ArrayList;
import java.util.List;

public class Luta {

    private List<Lutador> lutadores = new ArrayList<>();

    public void inscrever(String nomeLutador, String nomeCategoria, Integer peso) {
        Categoria categoria = CategoriaFactory.getCategoria(nomeCategoria, peso);
        Lutador lutador = new Lutador(nomeLutador, categoria);
        lutadores.add(lutador);
    }

    public List<String> obterLutadores() {
        List<String> saida = new ArrayList<String>();
        for (Lutador lutador : this.lutadores) {
             saida.add(lutador.obterLutador());
        }
        return saida;
    }
}
