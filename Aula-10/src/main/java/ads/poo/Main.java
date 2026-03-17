package ads.poo;

public class Main {
    public static void main(String[] args) {

        //Contador
        Contador meuContador = new Contador();
        meuContador.atribuirValor(10);
        meuContador.incrementar();
        System.out.println("Valor do Contador: " + meuContador.obterValor());

        //Personagem
        Personagem p = new Personagem();
        p.atacar();
        p.tomarDano(20.0);

        //Batedeira
        Batedeira b = new Batedeira();
        b.ligar();
        b.ajustarVelocidade(5);

        //Disciplina
        Disciplina disc = new Disciplina(); //instancia o objeto da classe Disciplina
        disc.exibirInformacoes(); //troca de mensagem para exibir os dados
    }
}