package exercicios.bonus;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calcularBonus();

    public void exibirDados(){
        System.out.println("nome: "+nome);
        System.out.println("salario: "+salario);
        System.out.println("Bonus: " + calcularBonus());

    }


}
