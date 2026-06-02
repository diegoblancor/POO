package ads.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class relogioDigital7 extends relogio {

    private static final double FATOR_BASE = 50.0;

    private final double origemX;
    private final double origemY;
    private final tamanho tam;
    private final tipoCronometro tipo;
    private Color corAcesa;
    private Color corApagada;

    // Com hora do sistema
    public relogioDigital7(double origemX, double origemY, tamanho tam) {
        super();
        this.origemX = origemX;
        this.origemY = origemY;
        this.tam     = tam;
        this.tipo    = tipoCronometro.RELOGIO;
        definirCoresPadrao();
    }

    // Com hora manual e tipo definido
    public relogioDigital7(double origemX, double origemY, tamanho tam,
                           int hora, int minuto, int segundo,
                           tipoCronometro tipo) {
        super(hora, minuto, segundo);
        this.origemX = origemX;
        this.origemY = origemY;
        this.tam     = tam;
        this.tipo    = tipo;
        definirCoresPadrao();

        if (tipo == tipoCronometro.PROGRESSIVO) {
            this.hora    = 0;
            this.minuto  = 0;
            this.segundo = 0;
        }
    }

    private void definirCoresPadrao() {
        Color verde     = new Color(0, 200, 60);
        this.corAcesa   = verde;
        this.corApagada = new Color(0, 30, 9);
    }

    public void setCores(Color acesa, Color apagada) {
        this.corAcesa   = acesa;
        this.corApagada = apagada;
    }

    @Override
    public void tick() {
        if (tipo == tipoCronometro.REGRESSIVO) {
            if (hora == 0 && minuto == 0 && segundo == 0) return;
            segundo--;
            if (segundo < 0) {
                segundo = 59;
                minuto--;
                if (minuto < 0) {
                    minuto = 59;
                    hora   = Math.max(0, hora - 1);
                }
            }
        } else {
            super.tick();
        }
    }

    @Override
    public void desenhar(Draw draw) {
        double f       = FATOR_BASE * tam.getFator();
        double esp     = f * 0.3;
        double largura = f * 1.3 + esp;

        int[] digitos = {
                hora    / 10, hora    % 10,
                minuto  / 10, minuto  % 10,
                segundo / 10, segundo % 10
        };

        double xAtual = origemX;
        for (int i = 0; i < 6; i++) {
            new display7(xAtual, origemY, f, corAcesa, corApagada)
                    .desenhar(draw, digitos[i]);
            xAtual += largura;

            // Separador ":" após o 2º e 4º dígito
            if (i == 1 || i == 3) {
                double r = f * 0.06;
                draw.setPenColor(corAcesa);
                draw.filledCircle(xAtual - esp / 2, origemY + f * 0.4, r);
                draw.filledCircle(xAtual - esp / 2, origemY + f * 0.8, r);
            }
        }
    }
}