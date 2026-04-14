package ads.poo;

import java.util.ArrayList;

public class Livro2 {
    private String titulo;
    private Pessoa autor;
    private Arraylist<Capitulo> capitulos;

    public Livro2(String titulo, Pessoa autor);

    {
        this.titulo = titulo;
        this.autor = autor;
        this.capitulos = new ArrayList<>();

    }

    public void adicionaCapitulo(String titulo) {
        Capitulo novoCapitulo = new Capitulo(titulo);
        capitulos.add(novoCapitulo);


    }

}






}
