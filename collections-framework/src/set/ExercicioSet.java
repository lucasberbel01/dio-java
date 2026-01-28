package set;

import java.util.*;

public class ExercicioSet {
    public static void main(String[] args) {
    //vermelho, laranja, amarelo, verde, azul, anil (índigo) e violeta

        Set<String> arcoIris = new TreeSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"));

        //exibir todas as cores uma embaixo da outra
        for(String cor : arcoIris) {
            System.out.println(cor);
        }
        System.out.println("");
        System.out.println("");

        //exibir em ordem alfabetica (ja esta porque usei TreeSet)
        System.out.println(arcoIris);

        System.out.println("");
        System.out.println("");

        List<String> listaArcoIris = new ArrayList<>(arcoIris);

        //exibir a lista em ordem inversa
        for (int i = (arcoIris.size() - 1); i >=0; i-- ){
            System.out.print(listaArcoIris.get(i) + " | ");
        }

        System.out.println("");
        System.out.println("");

        //exibir todas as cores que comecam com V e remover as outras
        Iterator<String> it = arcoIris.iterator();

        while (it.hasNext()) {
            String cor = it.next();

            if (!cor.startsWith("v")) {
                it.remove();

            }else{
                System.out.println(cor);

            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("novo set somente com as cores que comecam com V: " + arcoIris);

        System.out.println("");
        System.out.println("");

        //limpar o conjunto
        arcoIris.clear();
        //verificar
        System.out.println(arcoIris.isEmpty());




    }
}
