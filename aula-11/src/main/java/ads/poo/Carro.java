package ads.poo;

public class Carro {
    private String modelo;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    public final int VEL_MAX_MODELOS = 300;
    public static final int VEL_MINIMA = 0;

public Carro (String modelo){
    this.modelo = modelo;
    this.velocidadeMaxima = VEL_MAX_MODELOS;
}

public Carro (String modelo, int velocidadeMaxima){
    this.modelo = modelo;
    this.velocidadeMaxima = velocidadeMaxima;
}

public String getModelo(){
    return modelo;
}

public int getVelocidadeAtual(){
    return velocidadeAtual;
}

public int setVelocidadeMaxima(int v){
    return velocidadeMaxima = v;
}

public void acelerar(int velocidadeAdicionada){
    int velocidadeDesejada = velocidadeAdicionada + velocidadeMaxima;
    if (velocidadeDesejada <= velocidadeMaxima){
        velocidadeAtual += velocidadeAdicionada;
    } else {
        velocidadeAtual = velocidadeMaxima;
    }
}

public void frear(int velocidadeReduzida){
    int velocidadeDesejada = velocidadeAtual - velocidadeReduzida;
    if (velocidadeDesejada >= 0) {
        velocidadeAtual -= velocidadeReduzida;
    } else {
        velocidadeAtual = VEL_MINIMA;
    }
 }

}
