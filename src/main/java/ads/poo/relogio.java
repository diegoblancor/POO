package ads.poo;

import edu.princeton.cs.algs4.Draw;
import java.time.LocalTime;

public abstract class relogio implements desenhavel {

    protected int hora;
    protected int minuto;
    protected int segundo;

    // Construtor com hora do sistema
    public relogio() {
        LocalTime agora = LocalTime.now();
        this.hora    = agora.getHour();
        this.minuto  = agora.getMinute();
        this.segundo = agora.getSecond();
    }

    // Construtor com hora manual
    public relogio(int hora, int minuto, int segundo) {
        this.hora    = hora;
        this.minuto  = minuto;
        this.segundo = segundo;
    }

    // Avança 1 segundo
    public void tick() {
        segundo++;
        if (segundo >= 60) {
            segundo = 0;
            minuto++;
            if (minuto >= 60) {
                minuto = 0;
                hora = (hora + 1) % 24;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    // Cada subclasse implementa do seu jeito
    @Override
    public abstract void desenhar(Draw draw);
}