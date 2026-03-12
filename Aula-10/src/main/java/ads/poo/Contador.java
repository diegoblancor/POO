package ads.poo;

public class Contador {

    //Atributo
    private int valorAtual;

    //Métodos
    public void atribuirValor (int novoValor) {
        this.valorAtual = novoValor;
    }

    public void incrementar() {
        this.valorAtual++;
    }

    public int obterValor() {
        return this.valorAtual;
    }


}








