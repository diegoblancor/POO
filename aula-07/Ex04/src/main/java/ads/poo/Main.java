package ads.poo;

public class Main {
    static void main (String[] args) {

        Caneta bic = new Caneta();

        bic.setCor("azul");
        bic.setnivelTinta(0.01);

        String cor = bic.getCor();
        double nivel = bic.getNivelTinta();

        System.out.println(bic.isAberta());
        System.out.println(bic.getNivelTinta());
        bic.abrirTampa();
        System.out.println(bic.desenhar(1,1,1,2));
        System.out.println(bic.getNivelTinta());

    }

}
