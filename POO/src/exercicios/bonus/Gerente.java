package exercicios.bonus;

public class Gerente extends Funcionario {
    private static final double BONUS = 0.25;


    public Gerente(String nome, double salario) {
        super(nome, salario);

    }

    @Override
    public double calcularBonus() {
        return salario*BONUS;
    }
}
