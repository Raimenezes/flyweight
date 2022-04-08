public class Categoria {

    private String nome;
    private Integer peso;

    public Categoria(String nome, Integer peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPeso() {
        return peso;
    }
}
