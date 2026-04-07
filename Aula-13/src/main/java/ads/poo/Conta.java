package ads.poo;

public class Conta {

    private String nrConta;
    private String nome;
    private double saldo;

    public Conta(String nrConta, String nome, double saldoInicial) {
        this.nrConta = nrConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNrConta() {
        return nrConta;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if(valor>0){
            saldo += valor;
        } else{
            return;
        }
    }

    public String sacar(double valorDesejado){
        if(valorDesejado<=saldo){
            saldo-=valorDesejado;
            return "Sucesso!";
        } else {
            return "Saldo insuficiente";
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nrConta='" + nrConta + '\'' +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}