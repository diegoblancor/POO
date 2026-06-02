package ads.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class display7 {

    // Segmentos: { A, B, C, D, E, F, G } para cada dígito 0-9
    //   A = topo, B = sup dir, C = inf dir, D = base, E = inf esq, F = sup esq, G = meio
    private static final boolean[][] SEGMENTOS = {
            { true,  true,  true,  true,  true,  true,  false }, // 0
            { false, true,  true,  false, false, false, false }, // 1
            { true,  true,  false, true,  true,  false, true  }, // 2
            { true,  true,  true,  true,  false, false, true  }, // 3
            { false, true,  true,  false, false, true,  true  }, // 4
            { true,  false, true,  true,  false, true,  true  }, // 5
            { true,  false, true,  true,  true,  true,  true  }, // 6
            { true,  true,  true,  false, false, false, false }, // 7
            { true,  true,  true,  true,  true,  true,  true  }, // 8
            { true,  true,  true,  true,  false, true,  true  }, // 9
    };

    private final double x;
    private final double y;
    private final double f;
    private final Color corAcesa;
    private final Color corApagada;

    public display7(double x, double y, double fator, Color corAcesa, Color corApagada) {
        this.x          = x;
        this.y          = y;
        this.f          = fator;
        this.corAcesa   = corAcesa;
        this.corApagada = corApagada;
    }

    public void desenhar(Draw draw, int digito) {
        if (digito < 0 || digito > 9) digito = 8;
        boolean[] s = SEGMENTOS[digito];

        desenharHorizontal(draw, s[0], 0.2,  1.1);  // A - topo
        desenharVertical  (draw, s[1], 1.0,  0.3);  // B - superior direito
        desenharVertical  (draw, s[2], 1.0, -0.7);  // C - inferior direito
        desenharHorizontal(draw, s[3], 0.2, -0.9);  // D - base
        desenharVertical  (draw, s[4], 0.0, -0.7);  // E - inferior esquerdo
        desenharVertical  (draw, s[5], 0.0,  0.3);  // F - superior esquerdo
        desenharHorizontal(draw, s[6], 0.2,  0.1);  // G - meio
    }

    private void desenharHorizontal(Draw draw, boolean aceso, double xOff, double yOff) {
        draw.setPenColor(aceso ? corAcesa : corApagada);
        double xi = x + xOff * f;
        double yi = y + yOff * f;
        double[] xs = { 0.1*f+xi, 0.2*f+xi, 1.0*f+xi, 1.1*f+xi, 1.0*f+xi, 0.2*f+xi };
        double[] ys = { 0.2*f+yi, 0.3*f+yi, 0.3*f+yi, 0.2*f+yi, 0.1*f+yi, 0.1*f+yi };
        draw.filledPolygon(xs, ys);
    }

    private void desenharVertical(Draw draw, boolean aceso, double xOff, double yOff) {
        draw.setPenColor(aceso ? corAcesa : corApagada);
        double xi = x + xOff * f;
        double yi = y + yOff * f;
        double[] xs = { 0.1*f+xi, 0.2*f+xi, 0.2*f+xi, 0.1*f+xi, 0.0*f+xi, 0.0*f+xi };
        double[] ys = { 0.2*f+yi, 0.3*f+yi, 1.0*f+yi, 1.1*f+yi, 1.0*f+yi, 0.3*f+yi };
        draw.filledPolygon(xs, ys);
    }
}