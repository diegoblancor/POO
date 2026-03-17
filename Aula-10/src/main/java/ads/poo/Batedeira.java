//Escolha de batedeira para fazer pão.

package ads.poo;

public class Batedeira {

    //Atributos
    private String marca = "Arno";
    private int velocidade = 0;

    // Métodos
    public void ligar() {
        this.velocidade = 1;
        System.out.println("Batedeira " + marca + " ligada.");
    }

    public void ajustarVelocidade(int novaVelocidade) {
        this.velocidade = novaVelocidade;
    }
}