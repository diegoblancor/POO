package ads.poo;

public class Personagem {
    protected int vida;
    protected int ataque;
    protected double velocidade;

    public Personagem(int vida, int ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public String mover() {
        return "Personagem se move";
    }

    public String atacar() {
        return "Personagem ataca";
    }
}