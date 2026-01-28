package set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

        Set <Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        notas.contains(5d); //verifica se existe o elemento, true ou false

        notas.add(10d); // adiciona o valor

        notas.remove(7d); // remove o valor

        Collections.min(notas); //retorna o menor numero
        Collections.max(notas); //retorna o maior numero

        notas.size(); // retorna o tamanho do set

        notas.clear(); //limpa o set

        notas.isEmpty(); // verifica se esta vazia, true ou false

        Set<Double> notas2 = new TreeSet<>(notas); // TreeSet organiza o set na ordem natural dos elementos


        Iterator<Double> it = notas.iterator(); //iteradores serve para fazer modificacoes
                                                //de forma segura nos sets

        it.hasNext(); // verifica se existe um proximo

        it.next(); // retorna esse proximo

        it.remove(); // remove



    }
}
