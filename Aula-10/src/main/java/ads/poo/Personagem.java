package ads.poo;

public class Personagem {

        //Atributos
        private String nome = "Batman";
        private int nivel = 1;
        private double pontosVida = 100.0;


        //Métodos
        public void atacar() {
            System.out.println(nome + " realizou um ataque!");
        }

        public void tomarDano(double dano) {
            this.pontosVida -= dano;
        }
    }