package ads.poo;

public class Principal {
    public static void main(String[] args) {
        Aldeao aldeao = new Aldeao();
        Arqueiro arqueiro = new Arqueiro();
        Cavaleiro cavaleiro = new Cavaleiro();

        System.out.println(aldeao.mover());
        System.out.println(aldeao.atacar());

        System.out.println(arqueiro.mover());
        System.out.println(arqueiro.atacar());

        System.out.println(cavaleiro.mover());
        System.out.println(cavaleiro.atacar());
    }
}