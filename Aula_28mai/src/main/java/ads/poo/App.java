package ads.poo;
import java.util.Scanner;

public class App {
    static void main(String [] args){

    Scanner sc = new Scanner(System.in);

        IO.println("Entre com a sigla: ");
        String sigla = sc.nextLine();
        IO.println("Entre com o código: ");
        DiaDaSemana primeiro = DiaDaSemana.getByCodigo(sc.nextInt());
        DiaDaSemana segundo = DiaDaSemana.getByCodigo(sc.nextInt());

      Disciplina poo = new Disciplina (sigla, new DiaDaSemana[]{primeiro, segundo});

      IO.println(poo);


  }

}
