public class Lutador {

    private String nome;
    private Categoria categoria;

    public Lutador(String nome, Categoria categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String obterLutador() {
        return "Lutador{" +
               "nome='" + this.nome + '\'' +
               ", categoria='" + categoria.getNome() + '\'' +
               ", peso='" + categoria.getPeso() + '\'' +
               '}';
    }
}
