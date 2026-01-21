package exercicios.banco;

public class ContaBancaria {
    private String titular;
    private double saldo;


    public ContaBancaria(){}

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo =0.0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    //metodos
    public void exibirSaldo(){
        System.out.println("seu saldo atual é: " + saldo);
    }

    public double sacar(double valorSacar){
        if(valorSacar > saldo){
            System.out.println("Saldo insuficiente!");
            exibirSaldo();
            return 0;
        }
        else{
        return saldo-=valorSacar;
        }
    }

    public void depositar(double valor){

        saldo+=valor;
        exibirSaldo();
    }

}
