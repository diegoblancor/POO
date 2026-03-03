import java.util.Scanner;

public class EstacaoDoAno {
    static void main() {

        Scanner sc = new Scanner(System.in);
        IO.println("Entre com o dia: ");
        int dia = sc.nextInt();
        String mes = IO.readln("Entre com o mês: ");

        //saída
        if(mes.equals("marco") || mes.equals("abril") || mes.equals("maio") || mes.equals("junho") && dia>= 20) {
            IO.println("A estação é Outono");
        } else if(mes.equals("junho") || mes.equals("julho") || mes.equals("agosto") || mes.equals("setembro") && dia >= 21){
            IO.println("A estação é Inverno");
        } else if (mes.equals("setembro") || mes.equals("outubro") || mes.equals("novembro") || mes.equals("dezembro") && dia >= 22){
            IO.println("A estação é Primavera");
        } else {
            IO.println("A estação é Verão ");
        }
    }
}