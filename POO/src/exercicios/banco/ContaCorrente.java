package exercicios.banco;

public class ContaCorrente extends Conta{

    public ContaCorrente(String numero) {
        super(numero);
    }

    @Override
    public void depositar(double valor) {
        saldo+=valor;
        System.out.println("Valor depositado!");
        exibirSaldo();
    }

    @Override
    public double sacar(double valor) {
        double valorSacado = 0.0;

        if(valor>saldo){
            System.out.println("voce nao tem saldo suficiente!");
            exibirSaldo();
            return 0;
        }else{
             valorSacado= saldo -= valor;
            System.out.println("valor sacado com sucesso!");
            exibirSaldo();
            return valorSacado;
        }
    }
}
