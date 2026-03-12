package ads.poo;

public class Personagem {

    private String nome;
    private int pontos_vida;
    private int força;
    private int destreza;


    public void atacar() {
        System.out.println(this.nome + " realizou um ataque!");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }







}
