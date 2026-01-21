package exercicios.mercado;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Produto> produtos;

    public Pedido() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p){
        produtos.add(p);
        System.out.println("Produto adicionado");
    }

    public double calcularTotal(){

        double total = 0;

        for(Produto p : produtos){
            total += p.getPreco();

        }
        return total;
    }
}
