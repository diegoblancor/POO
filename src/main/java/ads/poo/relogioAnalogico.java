package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class relogioAnalogico extends relogio {

    private final double centroX;
    private final double centroY;
    private final double raio;

    public relogioAnalogico(double centroX, double centroY, double raio) {
        super();
        this.centroX = centroX;
        this.centroY = centroY;
        this.raio    = raio;
    }

    public relogioAnalogico(double centroX, double centroY, double raio,
                            int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
        this.centroX = centroX;
        this.centroY = centroY;
        this.raio    = raio;
    }

    @Override
    public void desenhar(Draw draw) {
        // Fundo branco
        draw.setPenColor(Draw.WHITE);
        draw.filledCircle(centroX, centroY, raio);

        // Borda
        draw.setPenColor(Draw.DARK_GRAY);
        draw.setPenRadius(0.002);
        draw.circle(centroX, centroY, raio);

        // Traços das 12 horas
        draw.setPenColor(Draw.BLACK);
        draw.setPenRadius(0.003);
        for (int i = 0; i < 12; i++) {
            double angulo = Math.toRadians(30.0 * i);
            draw.line(
                    centroX + raio * 0.82 * Math.sin(angulo),
                    centroY + raio * 0.82 * Math.cos(angulo),
                    centroX + raio * 0.95 * Math.sin(angulo),
                    centroY + raio * 0.95 * Math.cos(angulo)
            );
        }

        // Ângulos dos ponteiros
        double angHora    = Math.toRadians(30.0 * (hora % 12) + 0.5 * minuto);
        double angMinuto  = Math.toRadians(6.0 * minuto);
        double angSegundo = Math.toRadians(6.0 * segundo);

        // Ponteiro das horas (mais grosso e curto)
        draw.setPenColor(Draw.BLACK);
        draw.setPenRadius(0.006);
        draw.line(centroX, centroY,
                centroX + raio * 0.50 * Math.sin(angHora),
                centroY + raio * 0.50 * Math.cos(angHora));

        // Ponteiro dos minutos
        draw.setPenRadius(0.004);
        draw.line(centroX, centroY,
                centroX + raio * 0.75 * Math.sin(angMinuto),
                centroY + raio * 0.75 * Math.cos(angMinuto));

        // Ponteiro dos segundos (vermelho, fino)
        draw.setPenColor(Draw.RED);
        draw.setPenRadius(0.002);
        draw.line(centroX, centroY,
                centroX + raio * 0.80 * Math.sin(angSegundo),
                centroY + raio * 0.80 * Math.cos(angSegundo));

        // Ponto central
        draw.setPenColor(Draw.BLACK);
        draw.filledCircle(centroX, centroY, raio * 0.04);
    }
}