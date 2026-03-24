package ads.poo;

public class Ponto {

    //Atributos
    private double x;
    private double y;

    //Construtor
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Método acessor (getter)
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //Método modificador (setter)
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    //Representação do ponto em texto
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    //Cálculo da distância entre dois pontos
    public double distancia(Ponto outro) {
        double dx = outro.x - this.x;
        double dy = outro.y - this.y;

        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }
}


