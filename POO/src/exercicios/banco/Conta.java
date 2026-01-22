package exercicios.banco;

public abstract class Conta implements ContaBancaria{
    protected String numero;
    protected double saldo;

    public Conta(String numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    @Override
    public void exibirSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}
