package ads.poo;

public class Livro {

    private String titulo;
    private String nomeAutor;
    private int ano;
    private final String isbn;

    public Livro(String isbn, int ano, String nomeAutor, String titulo) {
        this.isbn = isbn;
        this.ano = ano;
        this.nomeAutor = nomeAutor;
        this.titulo = titulo;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public int getAno() {
        return ano;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", nomeAutor='" + nomeAutor + '\'' +
                ", ano=" + ano +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}