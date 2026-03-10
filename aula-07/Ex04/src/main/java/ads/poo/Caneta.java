package ads.poo;

public class Caneta {

    private String cor;
    private double nivelTinta;
    private boolean aberta;

    public boolean isAberta(){
        return aberta;
    }
    public String desenhar(boolean estaAberta, int x1, int y1, int x2, int y2){
        if (estaAberta){
            //calcular a distância percorrida
            double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            //debitar do nível de tinta
            double tintaConsumida = distancia * 0.01;
            nivelTinta -= tintaConsumida;
            //retornar a distância  percorrida
            return String.format("Desenhei %.2f cm na cor %s", distancia, cor);
        }else{
            return "A caneta está fechada";

        }

    }

    public String getCor() {
        return cor;
    }

    public double getNivelTinta() {
        return nivelTinta;
    }

    public void setCor(String c){
        cor = c;
    }

    public void setnivelTinta(double nivel){
        nivelTinta = nivel;
    }

    public void abrirTampa (){
        aberta = true;
    }
    public void fecharTampa () {
        aberta = false;

    }
}