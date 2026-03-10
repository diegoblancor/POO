package ads.poo;

public class Main {
    static void main (String[] args) {

        Caneta bic = new Caneta();

        bic.setCor("azul");
        bic.setnivelTinta(100);

        String cor = bic.getCor();
        double nivel = bic.getNivelTinta();

        System.out.println(bic.isAberta());
        System.out.println(bic.getNivelTinta());
        System.out.println(bic.desenhar(bic.isAberta(),1,1,1,2));
        System.out.println(bic.getNivelTinta());

    }

}
