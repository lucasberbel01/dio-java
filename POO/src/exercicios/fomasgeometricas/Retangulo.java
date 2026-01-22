package exercicios.fomasgeometricas;

public class Retangulo extends Forma{
    private double base, lado;

    public Retangulo(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return base*lado;
    }
}
