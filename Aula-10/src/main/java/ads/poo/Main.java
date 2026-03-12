package ads.poo;

public class Main {
    public static void main(String[] args) {

        //Contador
        Contador meuContador = new Contador(); //Objeto instanciado
        meuContador.atribuirValor(1);
        meuContador.incrementar();
        System.out.println("Valor: " + meuContador.obterValor());

    }
}

    public static void main(String[] args) {

        //Criando o objeto na memória
        Personagem heroi = new Personagem();

        //Modificar atributos
        heroi.setNome("Arqueiro");
        heroi.setStr(15);

        //Estado e comportamento
        System.out.println("Personagem criado: " + heroi.getNome());

        //Método que representa a ação
        heroi.atacar();
    }

