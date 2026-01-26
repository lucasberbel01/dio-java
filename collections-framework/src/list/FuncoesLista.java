package list;

import java.util.*;

public class FuncoesLista {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(); // criar lista vazia
        List<Double> notas = new ArrayList<>(Arrays.asList(1d,40.5,3.5)); // criar lista povoada


        nomes.add("marcella"); //adiona um elemento no final da lista
        nomes.add(0,"lucas"); //adiciona na posicao 0 o elemento "lucas" e move todos
                                            // os proximos elementos para a direita

        notas.set(1,5d); //substitui o elemento na posicao 1 pelo valor 5

        notas.contains(40.5); // verifica se o valor esta na lista (true or false)

        notas.get(2); // exibe o valor na posicao 2 da lista

        Collections.min(notas); // exibe o menor numero
        Collections.max(notas); // exibe o maior numero

        notas.size(); //tamanho da lista

        notas.remove(1); // remove o item da posicao 1;

        notas.remove(40.5); // remove o item de valor 40.5;

        notas.indexOf(40.5); // pega o indice do valor 40.5

        notas.clear(); // apaga toda a lista

        notas.isEmpty();// retorna true se a lista estiver vazia

        Collections.shuffle(notas); // embaralha a lista

    }


}