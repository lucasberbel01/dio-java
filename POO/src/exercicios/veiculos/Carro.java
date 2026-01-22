package exercicios.veiculos;

public class Carro extends Veiculo {
    private int qtdPortas;

    public Carro(int qtdPortas ,String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.qtdPortas = qtdPortas;
    }

    @Override
    public void exibirInfo() {
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("ano: " + ano);
        System.out.println("quantidade de portas: " + qtdPortas);
    }
}
