package model;

public abstract class Conta {
    private Titular titular;
    private int numeroDaConta;
    private String senha;
    private double saldo;

    public Conta(Titular titular, String senha) {
        this.titular = titular;
        setSenha(senha);
        this.saldo = 0d;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if(senha == null ||senha.length() < 7){
            throw new RuntimeException("A senha deve conter ao menos 7 caracteres!");
        }
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract double sacar(String senha, double valor);

    public void depositar (String senha, double valor){
        if(!this.senha.equals(senha)){
            throw new RuntimeException("Senha incorreta!");
        }
        else if(valor < 0){
            throw new RuntimeException("O valor a depositar nao pode ser negativo!");
        }
        this.saldo += valor;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular=" + titular +
                ", numeroDaConta=" + numeroDaConta +
                ", saldo=" + saldo +
                '}';
    }
}
