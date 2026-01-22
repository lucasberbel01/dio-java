package exercicios.banco;

public interface ContaBancaria {

    void depositar(double valor);
    double sacar(double valor);
    void exibirSaldo();
}
