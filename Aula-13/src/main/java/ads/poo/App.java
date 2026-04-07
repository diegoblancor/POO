package ads.poo;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private ArrayList<Conta> contas;

    public App(){
        this.contas = new ArrayList<>();
    }

    void menu(int opcao){
        switch (opcao){
            case "1": -> {cadastrar();}
            case "2": -> {listarTodas();}
            case "3": -> {depositar();}
            case "4": -> {sacar();}
            case "5": -> {sair();}
        }
    }
    void cadastrar(){

        String nrConta = IO.readln("Número da conta");
        String nome = IO.readln("Nome do titular");
        double saldo = Double.parseDouble(IO.readln("Saldo inicial: "));

        Conta conta = new Conta(nrConta, nome, saldo);
    }

    ArrayList<Conta> listarTodas(){
        return contas;
    }

    void depositar(){
        double valor = Double.parseDouble(IO.readln("Valor Desejado: "));

    }

    String sacar(double valor){

    }

    void sair(){
        return;
    }

    static void main(String[] args) {
        App app = new App();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do{
            IO.println("   Menu\n" +
                    "        1- Cadastrar Contas\n" +
                    "        2- Listar todas Contas\n" +
                    "        3- Depositar em uma Conta\n" +
                    "        4- Sacar de uma Conta\n" +
                    "        5- Sair");

            IO.println("Entre com uma Opção");
            opcao =  sc.nextInt();
            app.menu(opcao);
        } while (opcao!=5);

    }
}