package exercicios.veiculos;

public class Carro extends Veiculo {
    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void ligar() {
        System.out.println("liguei o carro");
    }
}
