package ads.poo;

public class Main {
    static void main(String [] args) {
        //Teste para o ponto
        Ponto p1 = new Ponto(0, 0);
        Ponto p2 = new Ponto(3, 4);

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);

        double d = p1.distancia(p2);
        System.out.println("Distância = " + d);
    }
}
