package exercicios.bonus;

public class Dev extends Funcionario {
    private static final double BONUS = 0.1;

    public Dev(String nome, double salario) {
        super(nome, salario);

    }

    @Override
    public double calcularBonus() {
        return salario*BONUS;
    }
}
