package ads.poo;

public class Disciplina {

    //Atributos
    private String nome = "Programação Orientada à Objetos";
    private String codigo = "POO";
    private String cargaHoraria = "80h";

    //Métodos
    public void exibirInformacoes() {
        System.out.println("Disciplina: " + nome + "/ Código: " + codigo +  "/ Carga Horária: " + cargaHoraria);
    }
}