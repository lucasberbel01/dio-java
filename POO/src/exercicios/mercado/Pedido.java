package exercicios.mercado;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
        private ArrayList<Produto> produtos;

    public Pedido(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public void calculaTotal(){
        double soma = 0.0;

        for (Produto p : produtos){
            soma+=p.getPreco();
        }
        System.out.println("total da compra: " + soma );
    }
}

