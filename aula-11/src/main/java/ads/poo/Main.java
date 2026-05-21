package ads.poo;

import java.util.Scanner;

public class Main {

    static void main() {


        //Classe pessoa
        Pessoa p = new Pessoa("Diego Blanco", "010101010101", "algumacoisa@gmail.com");
        IO.println(p);

        //Classe carro
        Carro meuCarro = new Carro("Fusca");
        IO.println("Modelo: " + meuCarro.getModelo());

        meuCarro.acelerar(50);
        System.out.println("Velocidade após acelerar 50km/h: " + meuCarro.getVelocidadeAtual());

        meuCarro.frear(20);
        System.out.println("Velocidade após frear 20km/h: " + meuCarro.getVelocidadeAtual());

        //Testando a velocidade máxima)
        Carro carroEsportivo = new Carro("Ferrari", 320);
        System.out.println("\nModelo: " + carroEsportivo.getModelo());

        carroEsportivo.acelerar(100);
        System.out.println("Velocidade da Ferrari: " + carroEsportivo.getVelocidadeAtual());

    }
}