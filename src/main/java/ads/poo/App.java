package ads.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class App {

    public static void main(String[] args) throws Exception {

        int W = 800;
        int H = 700;
        int CX = W / 2; // 400 — centro horizontal

        Draw draw = new Draw();
        draw.setCanvasSize(W, H);
        draw.setXscale(0, W);
        draw.setYscale(0, H);
        draw.enableDoubleBuffering();
        draw.setDefaultCloseOperation(3);

        ArrayList<relogio> relogios = new ArrayList<>();

        // display PEQUENO: f=25, largura total ~310px, começa em CX-155
        int dispX = CX - 155;

        // 1) Texto por extenso — centralizado
        relogios.add(new relogioDigitalTexto(CX, 665, 13));

        // 2) 7 seg hora do sistema
        relogios.add(new relogioDigital7(dispX, 570, tamanho.PEQUENO));

        // 3) Cronômetro progressivo
        relogioDigital7 progressivo = new relogioDigital7(
                dispX, 430, tamanho.PEQUENO,
                0, 0, 0, tipoCronometro.PROGRESSIVO
        );
        progressivo.setCores(new Color(0, 180, 255), new Color(0, 25, 40));
        relogios.add(progressivo);

        // 4) Cronômetro regressivo
        relogioDigital7 regressivo = new relogioDigital7(
                dispX, 290, tamanho.PEQUENO,
                0, 1, 30, tipoCronometro.REGRESSIVO
        );
        regressivo.setCores(new Color(255, 80, 30), new Color(60, 10, 0));
        relogios.add(regressivo);

        // 5) Analógico — centralizado, base da tela
        relogios.add(new relogioAnalogico(CX, 110, 85));

        while (true) {
            draw.clear(Draw.BLACK);

            draw.setPenColor(Draw.LIGHT_GRAY);
            draw.setFont(draw.getFont().deriveFont(11f));

            draw.text(CX, 688, "Relógio texto");
            draw.text(CX, 628, "7 seg — hora do sistema");
            draw.text(CX, 488, "Cronômetro progressivo");
            draw.text(CX, 348, "Cronômetro regressivo");
            draw.text(CX, 210, "Analógico");

            for (relogio r : relogios) {
                r.tick();
                r.desenhar(draw);
            }

            draw.show();
            TimeUnit.SECONDS.sleep(1);
        }
    }
}