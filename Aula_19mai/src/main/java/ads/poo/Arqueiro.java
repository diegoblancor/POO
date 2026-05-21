package ads.poo;

public class Arqueiro extends Personagem {

    public Arqueiro() {
        super(35, 2, 1.0);
    }

    @Override
    public String mover() {
        return "Arqueiro avança em posição de combate";
    }

    @Override
    public String atacar() {
        return "Arqueiro dispara uma flecha";
    }
}