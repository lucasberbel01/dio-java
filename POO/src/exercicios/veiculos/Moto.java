package exercicios.veiculos;

public class Moto extends Veiculo {
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void ligar() {
        System.out.println("liguei a moto");
    }
}
