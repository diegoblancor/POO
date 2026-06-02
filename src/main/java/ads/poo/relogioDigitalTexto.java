package ads.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;
import java.awt.Font;

public class relogioDigitalTexto extends relogio {

    private static final int FONTE_MIN = 10;
    private static final int FONTE_MAX = 40;

    private final double posX;
    private final double posY;
    private int tamanhoFonte;
    private final tipoCronometro tipo;
    private Color cor;

    private static final String[] UNIDADES = {
            "zero", "um", "dois", "três", "quatro", "cinco",
            "seis", "sete", "oito", "nove", "dez",
            "onze", "doze", "treze", "quatorze", "quinze",
            "dezesseis", "dezessete", "dezoito", "dezenove"
    };

    private static final String[] DEZENAS = {
            "", "", "vinte", "trinta", "quarenta", "cinquenta"
    };

    private String porExtenso(int numero) {
        if (numero < 20) return UNIDADES[numero];
        int dezena = numero / 10;
        int unidade = numero % 10;
        if (unidade == 0) return DEZENAS[dezena];
        return DEZENAS[dezena] + " e " + UNIDADES[unidade];
    }

    // Com hora do sistema, modo RELOGIO
    public relogioDigitalTexto(double posX, double posY, int tamanhoFonte) {
        super();
        this.posX         = posX;
        this.posY         = posY;
        this.tipo         = tipoCronometro.RELOGIO;
        this.cor          = Draw.GREEN;
        this.tamanhoFonte = limitar(tamanhoFonte);
    }

    // Com hora manual e tipo definido
    public relogioDigitalTexto(double posX, double posY, int tamanhoFonte,
                               int hora, int minuto, int segundo,
                               tipoCronometro tipo) {
        super(hora, minuto, segundo);
        this.posX         = posX;
        this.posY         = posY;
        this.tipo         = tipo;
        this.cor          = Draw.GREEN;
        this.tamanhoFonte = limitar(tamanhoFonte);

        if (tipo == tipoCronometro.PROGRESSIVO) {
            this.hora    = 0;
            this.minuto  = 0;
            this.segundo = 0;
        }
    }

    private int limitar(int valor) {
        return Math.max(FONTE_MIN, Math.min(FONTE_MAX, valor));
    }

    public void setCor(Color cor) {
        this.cor = cor;
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
        Font fonteOriginal = draw.getFont();
        draw.setFont(fonteOriginal.deriveFont((float) tamanhoFonte));
        draw.setPenColor(cor);

        String texto = porExtenso(hora) + " horas, " +
                porExtenso(minuto) + " minutos e " +
                porExtenso(segundo) + " segundos";

        draw.text(posX, posY, texto);
        draw.setFont(fonteOriginal);
    }
}