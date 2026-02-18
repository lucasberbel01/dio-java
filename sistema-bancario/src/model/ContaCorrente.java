package model;

public class ContaCorrente extends Conta {

    //titular
    //numero da conta
    //senha
    //saldo

    public ContaCorrente(Titular titular, int numeroDaConta, String senha) {
        super(titular, numeroDaConta, senha);
    }

    @Override
    public double sacar(String senha, double valor) { // conta corrente PODE ficar negarivada
        if(!getSenha().equals(senha)){
            throw new RuntimeException("Senha incorreta!");
        } else if (valor < 0) {
            throw new RuntimeException("o valor a sacar nao pode ser negativo!");
        }

        setSaldo(getSaldo() - valor);
        return valor;
    }
}
