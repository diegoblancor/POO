package ads.poo;

import java.util.ArrayList;
import java.util.Arrays;

public class Disciplina {

    private String sigla;
    private DiaDaSemana[] dias;

    public Disciplina(String sigla, DiaDaSemana[] dias) {
    this.sigla = sigla;
    this.dias = dias;
}

    @Override
    public String toString() {
        return "Sigla: " + sigla + '\n' +
            "aulas: " + Arrays.toString(dias);


    }

}
