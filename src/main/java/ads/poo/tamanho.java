package ads.poo;

public enum tamanho {
    PEQUENO(0.5),
    MEDIO(1.0),
    GRANDE(1.5);

    private final double fator;

    tamanho(double fator) {
        this.fator = fator;
    }

    public double getFator() {
        return fator;
    }
}