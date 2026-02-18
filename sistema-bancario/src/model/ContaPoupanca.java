package model;

public class ContaPoupanca extends Conta{

    //titular
    //numero da conta
    //senha
    //saldo

    public ContaPoupanca(Titular titular, int numeroDaConta, String senha) {
        super(titular, numeroDaConta, senha);
    }

    @Override
    public double sacar(String senha, double valor) {// conta poupanca NAO PODE ficar negativada
        if(!getSenha().equals(senha)){
            throw new RuntimeException("Senha incorreta!");
        }

        else if(valor > getSaldo()){
            throw new RuntimeException("Saldo insuficiente!");
        }

        else if (valor < 0){
            throw new RuntimeException("o valor a sacar nao pode ser negativo!");
        }
        setSaldo(getSaldo() - valor);
        return valor;
    }


}
