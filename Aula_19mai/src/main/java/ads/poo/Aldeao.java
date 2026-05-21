package ads.poo;

public class Aldeao extends Personagem {

    public Aldeao() {
        super(25, 1, 0.8);
    }

    @Override
    public String mover() {
        return "Aldeão caminha devagar";
    }

    @Override
    public String atacar() {
        return "Aldeão ataca com a enxada";
    }
}