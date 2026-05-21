package ads.poo;

public class Cavaleiro extends Personagem {

    public Cavaleiro() {
        super(50, 3, 2.0);
    }

    @Override
    public String mover() {
        return "Cavaleiro galopa em seu cavalo";
    }

    @Override
    public String atacar() {
        return "Cavaleiro golpeia com a espada";
    }
}