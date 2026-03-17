package ads.poo;

public class Contador {

    //Atributo
    private int valorAtual;

    //Métodos

    //atribuir valor ao contador
    public void atribuirValor (int valor) {
        this.valorAtual = valor;
    }

    public void incrementar() {

        this.valorAtual++;

    }

    public int obterValor() {
        return this.valorAtual;
    }

}








